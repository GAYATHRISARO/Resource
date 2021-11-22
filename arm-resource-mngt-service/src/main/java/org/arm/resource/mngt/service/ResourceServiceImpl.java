package org.arm.resource.mngt.service;

import java.util.List;


import org.arm.resource.mngt.model.Resource;
import org.arm.resource.mngt.repository.IResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ResourceServiceImpl implements IResourceService {

	@Autowired
	private IResourceRepository resourceRepository;

	@Override
	public String addResource(Resource resource) {
		resourceRepository.save(resource);
		return "Resource Added";
	}

	@Override
	public String updateResource(Resource resource) {
		resourceRepository.save(resource);
		return "Resource updated";
	}

	@Override
	public String deleteResource(int resourceId) {
		resourceRepository.deleteById(resourceId);
		return "Deleted Successfully";
	}

	@Override
	public Resource getById(int resourceId) {
		return resourceRepository.findById(resourceId).get();
	}

	@Override
	public List<Resource> getAll() {
		return resourceRepository.findAll();
	}

}
