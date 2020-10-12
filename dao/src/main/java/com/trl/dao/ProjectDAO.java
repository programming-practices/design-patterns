package com.trl.dao;

import com.trl.entity.Project;

import java.util.List;

public interface ProjectDAO {

    // create
    void add(Project project);

    // read
    List<Project> getAll();
    Project getById(Long id);

    // update
    void update(Project project);

    // delete
    void remove(Project project);
}
