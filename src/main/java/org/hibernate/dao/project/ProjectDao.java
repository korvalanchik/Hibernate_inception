package org.hibernate.dao.project;

import org.hibernate.enitty.Project;

import java.util.List;

public interface ProjectDao {

    void deleteById (Long id);

    List<Project> getLongestProjects();
}
