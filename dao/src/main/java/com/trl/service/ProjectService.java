package com.trl.service;

import com.trl.bl.Util;
import com.trl.dao.ProjectDAO;
import com.trl.entity.Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectService extends Util implements ProjectDAO {
    @Override
    public void add(Project project) {
        String sql = "INSERT INTO project (id, title) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, project.getId());
            preparedStatement.setString(2, project.getTitle());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Project> getAll() {
        List<Project> projectList = new ArrayList<>();
        String sql = "SELECT id, title FROM project";
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Project project = new Project();

                project.setId(resultSet.getLong("id"));
                project.setTitle(resultSet.getString("title"));

                projectList.add(project);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projectList;
    }

    @Override
    public Project getById(Long id) {
        Project project = new Project();
        String sql = "SELECT id, title FROM project WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()){
                    project.setId(resultSet.getLong("id"));
                    project.setTitle(resultSet.getString("title"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return project;
    }

    @Override
    public void update(Project project) {
        String sql = "UPDATE project SET title = ? WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, project.getTitle());
            preparedStatement.setLong(2, project.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Project project) {
        String sql = "DELETE FROM project WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, project.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
