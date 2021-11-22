package org.arm.resource.mngt.repository;

import org.arm.resource.mngt.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResourceRepository extends JpaRepository<Resource, Integer> {

}
