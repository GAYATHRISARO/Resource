package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.model.Project;
import org.arm.resource.mngt.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements IProjectService {

	@Autowired
	private IProjectRepository projectRepository;

	@Override
	public String addProject(Project project) {
		projectRepository.save(project);
		return "Project Added";
	}

	@Override
	public String updateProject(Project project) {
		projectRepository.save(project);
		return "Project updated";
	}

	@Override
	public String deleteProject(int projectId) {
		projectRepository.deleteById(projectId);
		return "Deleted Successfully";
	}

	@Override
	public Project getById(int projectId) {
		return projectRepository.findById(projectId).get();
	}

	@Override
	public List<Project> getAll() {
		return projectRepository.findAll();
	}

}
