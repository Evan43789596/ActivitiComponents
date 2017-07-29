package com.evan.oa.service;

import com.evan.oa.entity.Salary;

import java.io.Serializable;

public interface ISalaryService {

	public Serializable doAdd(Salary salary) throws Exception;
	
	public void doUpdate(Salary salary) throws Exception;
	
	public Salary findByUserId(String userId) throws Exception;
	
	public Salary findById(Integer id) throws Exception;
}
