package com.trl.service;

import com.trl.bl.Util;
import com.trl.dao.AddressDAO;
import com.trl.entity.Address;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressService extends Util implements AddressDAO {

    @Override
    public void add(Address address) {
        String sql = "INSERT INTO address (id, country, city, street, post_code) VALUES(?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, address.getId());
            preparedStatement.setString(2, address.getCountry());
            preparedStatement.setString(3, address.getCity());
            preparedStatement.setString(4, address.getStreet());
            preparedStatement.setString(5, address.getPost_Code());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Address> getAll() {
        List<Address> addressList = new ArrayList<>();
        String sql = "SELECT id, country, city, street, post_code FROM address";
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);){

            while (resultSet.next()){
                Address address = new Address();

                address.setId(resultSet.getLong("id"));
                address.setCountry(resultSet.getString("country"));
                address.setCity(resultSet.getString("city"));
                address.setStreet(resultSet.getString("street"));
                address.setPost_Code(resultSet.getString("post_code"));

                addressList.add(address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addressList;
    }

    @Override
    public Address getById(Long id) {
        Address address = new Address();
        String sql = "SELECT id, country, city, street, post_code FROM address WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()){
                while (resultSet.next()){
                    address.setId(resultSet.getLong("id"));
                    address.setCountry(resultSet.getString("country"));
                    address.setCity(resultSet.getString("city"));
                    address.setStreet(resultSet.getString("street"));
                    address.setPost_Code(resultSet.getString("post_code"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public void update(Address address) {
        String sql = "UPDATE address SET country = ?, city = ?, street = ?, post_code = ? WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, address.getCountry());
            preparedStatement.setString(2, address.getCity());
            preparedStatement.setString(3, address.getStreet());
            preparedStatement.setString(4, address.getPost_Code());
            preparedStatement.setLong(5, address.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Address address) {
        String sql = "DELETE FROM address WHERE id = ?";
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setLong(1, address.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
