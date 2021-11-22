package org.arm.resource.mngt.repository;

import org.arm.resource.mngt.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository extends JpaRepository<Task, Integer>{
	
	

}
