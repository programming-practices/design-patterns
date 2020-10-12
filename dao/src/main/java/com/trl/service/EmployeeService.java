package com.trl.service;

import com.trl.bl.Util;
import com.trl.dao.EmployeeDAO;
import com.trl.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService extends Util implements EmployeeDAO {
    @Override
    public void add(Employee employee) {
        String sql = "INSERT INTO employee (id, first_name, last_name, birthday, address_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, employee.getId());
            preparedStatement.setString(2, employee.getFirst_Name());
            preparedStatement.setString(3, employee.getLast_Name());
            preparedStatement.setDate(4, employee.getBirthday());
            preparedStatement.setLong(5, employee.getAddress_Id());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "SELECT id, first_name, last_name, birthday, address_id FROM employee";
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Employee employee = new Employee();

                employee.setId(resultSet.getLong("id"));
                employee.setFirst_Name(resultSet.getString("first_name"));
                employee.setFirst_Name(resultSet.getString("last_name"));
                employee.setBirthday(resultSet.getDate("birthday"));
                employee.setAddress_Id(resultSet.getLong("address_id"));

                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee getById(Long id) {
        Employee employee = new Employee();
        String sql = "SELECT id, first_name, last_name, birthday, address_id FROM employee WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()){
                    employee.setId(resultSet.getLong("id"));
                    employee.setFirst_Name(resultSet.getString("first_name"));
                    employee.setLast_Name(resultSet.getString("last_name"));
                    employee.setBirthday(resultSet.getDate("birthday"));
                    employee.setAddress_Id(resultSet.getLong("address_id"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void update(Employee employee) {
        String sql = "UPDATE employee SET first_name = ?, last_name = ?, birthday = ?, address_id = ? WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, employee.getFirst_Name());
            preparedStatement.setString(2, employee.getLast_Name());
            preparedStatement.setDate(3, employee.getBirthday());
            preparedStatement.setLong(4, employee.getAddress_Id());
            preparedStatement.setLong(5, employee.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Employee employee) {
        String sql = "DELETE FROM employee WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setLong(1, employee.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
