package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.model.Campaign;
import org.arm.resource.mngt.model.Task;
import org.arm.resource.mngt.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements ITaskService {

	@Autowired
	private ITaskRepository taskRepository;

	@Override
	public String addTask(Task task) {
		taskRepository.save(task);
		return "Task Added";
	}

	@Override
	public String updateTask(Task task) {
		taskRepository.save(task);
		return "Task updated";
	}

	@Override
	public String deleteTask(int taskId) {
		taskRepository.deleteById(taskId);
		return "Deleted Successfully";
	}

	@Override
	public Task getById(int taskId) {
		return taskRepository.findById(taskId).get();
	}

	@Override
	public List<Task> getAll() {
		return taskRepository.findAll();
	}

}
