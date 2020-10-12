package com.trl.service;

import com.trl.bl.Util;
import com.trl.dao.Empl_ProjDAO;
import com.trl.entity.Empl_Proj;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Empl_ProjService extends Util implements Empl_ProjDAO {
    @Override
    public void add(Empl_Proj empl_proj) {
        String sql = "INSERT INTO empl_proj (employee_id, project_id) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, empl_proj.getEmployee_Id());
            preparedStatement.setLong(2, empl_proj.getProject_Id());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Empl_Proj> getAll() {
        List<Empl_Proj> empl_projList = new ArrayList<>();
        String sql = "SELECT employee_id, project_id FROM empl_proj";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()){

            try (ResultSet resultSet = statement.executeQuery(sql)){
                while (resultSet.next()){
                    Empl_Proj empl_proj = new Empl_Proj();

                    empl_proj.setEmployee_Id(resultSet.getLong("employee_id"));
                    empl_proj.setProject_Id(resultSet.getLong("project_id"));

                    empl_projList.add(empl_proj);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empl_projList;
    }

    @Override
    public Empl_Proj getByEmployeeIdAndProjectId(Long employee_Id, Long project_Id) {
        Empl_Proj empl_proj = new Empl_Proj();
        String sql = "SELECT employee_id, project_id FROM empl_proj WHERE employee_id = ? AND project_id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, employee_Id);
            preparedStatement.setLong(2, project_Id);

            try (ResultSet resultSet = preparedStatement.executeQuery()){
                while (resultSet.next()){
                    empl_proj.setEmployee_Id(resultSet.getLong("employee_id"));
                    empl_proj.setProject_Id(resultSet.getLong("project_id"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empl_proj;
    }

    @Override
    public void update(Empl_Proj empl_proj) {
        String sql = "UPDATE empl_proj SET project_id = ? WHERE employee_id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, empl_proj.getProject_Id());
            preparedStatement.setLong(2, empl_proj.getEmployee_Id());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Empl_Proj empl_proj) {
        String sql = "DELETE FROM empl_proj WHERE employee_id = ? AND prpject_id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, empl_proj.getEmployee_Id());
            preparedStatement.setLong(2, empl_proj.getProject_Id());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
