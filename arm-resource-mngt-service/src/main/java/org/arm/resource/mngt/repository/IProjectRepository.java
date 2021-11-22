package org.arm.resource.mngt.repository;

import org.arm.resource.mngt.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends JpaRepository<Project, Integer>{
	
	

}
