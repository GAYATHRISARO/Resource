package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.model.Task;

public interface ITaskService {
	public String addTask(Task task);

	public String updateTask(Task task);

	public String deleteTask(int taskId);

	Task getById(int taskId);

	List<Task> getAll();
}
