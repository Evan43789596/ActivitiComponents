package com.evan.oa.service;

import com.evan.oa.entity.Vacation;
import com.evan.oa.pagination.Page;

import java.io.Serializable;
import java.util.List;

public interface IVacationService {

	public Serializable doAdd(Vacation vacation) throws Exception;
	
	public void doUpdate(Vacation vacation) throws Exception;
	
	public void doDelete(Vacation vacation) throws Exception;
	
	public List<Vacation> toList(Integer userId) throws Exception;
	
	public Vacation findById(Integer id) throws Exception;
	
	public List<Vacation> findByStatus(Integer userId, String status, Page<Vacation> page) throws Exception;
}
