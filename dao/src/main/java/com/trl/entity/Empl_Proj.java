package com.trl.entity;

import java.util.Objects;

public class Empl_Proj {
    private Long employee_id;
    private Long project_id;

    public Empl_Proj() {
    }

    public Long getEmployee_Id() {
        return employee_id;
    }

    public void setEmployee_Id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Long getProject_Id() {
        return project_id;
    }

    public void setProject_Id(Long project_id) {
        this.project_id = project_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empl_Proj empl_proj = (Empl_Proj) o;
        return Objects.equals(employee_id, empl_proj.employee_id) &&
                Objects.equals(project_id, empl_proj.project_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_id, project_id);
    }

    @Override
    public String toString() {
        return "Empl_Proj{" +
                "employee_id=" + employee_id +
                ", project_id=" + project_id +
                '}';
    }
}
