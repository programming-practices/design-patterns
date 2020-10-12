package com.trl.dao;

import com.trl.entity.Empl_Proj;

import java.util.List;

public interface Empl_ProjDAO {

    // create
    void add(Empl_Proj empl_proj);

    // read
    List<Empl_Proj> getAll();

    Empl_Proj getByEmployeeIdAndProjectId(Long employee_Id, Long project_Id);

    // update
    void update(Empl_Proj empl_proj);

    // delete
    void remove(Empl_Proj empl_proj);
}
