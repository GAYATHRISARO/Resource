package org.arm.resource.mngt.service;

import java.util.List;

import org.arm.resource.mngt.model.Resource;

public interface IResourceService {
	public String addResource(Resource resource);

	public String updateResource(Resource resource);

	public String deleteResource(int resourceId);

	Resource getById(int resourceId);

	List<Resource> getAll();
}
