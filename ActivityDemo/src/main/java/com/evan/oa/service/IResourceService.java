package com.evan.oa.service;

import com.evan.oa.pagination.Page;
import com.evan.oa.entity.GroupAndResource;
import com.evan.oa.entity.Resource;

import java.util.List;

public interface IResourceService {

	public Resource getPermissions(Integer id) throws Exception;
	
	public List<Resource> getMenus(List<GroupAndResource> gr) throws Exception;
	
	public List<Resource> getAllResource() throws Exception;
	
	public List<Resource> getResourceListPage() throws Exception;
	
	public List<Resource> getResourceList(Page<Resource> p) throws Exception;
	
	public List<Resource> getResourceByType() throws Exception;
	
	public void doAdd(Resource entity) throws Exception;
	
	public void doUpdate(Resource entity) throws Exception;
	
	public void doDelete(Resource entity) throws Exception;
	
	public void doDelete(String id) throws Exception;
	
}
