package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.model.Project;

public interface IProjectService {
	public String addProject(Project project);

	public String updateProject(Project project);

	public String deleteProject(int projectId);

	Project getById(int projectId);

	List<Project> getAll();
}
