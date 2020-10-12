package com.trl.entity;

import java.sql.Date;
import java.util.Objects;

public class Employee {
    private Long id;
    private String first_name;
    private String last_name;
    private Date birthday;
    private Long address_id;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return first_name;
    }

    public void setFirst_Name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_Name() {
        return last_name;
    }

    public void setLast_Name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getAddress_Id() {
        return address_id;
    }

    public void setAddress_Id(Long address_id) {
        this.address_id = address_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(first_name, employee.first_name) &&
                Objects.equals(last_name, employee.last_name) &&
                Objects.equals(birthday, employee.birthday) &&
                Objects.equals(address_id, employee.address_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, birthday, address_id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday=" + birthday +
                ", address_id=" + address_id +
                '}';
    }
}
