package com.trl.dao;

public class Customer {
    public static void main(String[] args) {
        DAOInterface data = new DataBase();
        DAOInterface data2 = new FileSystem();
        data2.getData();
        data.getData();
    }

}
