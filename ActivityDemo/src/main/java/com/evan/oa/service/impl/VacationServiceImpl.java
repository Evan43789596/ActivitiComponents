package com.evan.oa.service.impl;

import com.evan.oa.entity.Vacation;
import com.evan.oa.pagination.Page;
import com.evan.oa.service.IBaseService;
import com.evan.oa.service.IVacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class VacationServiceImpl implements IVacationService {
	
	@Autowired
	private IBaseService<Vacation> baseService;
	
	@Override
	public Serializable doAdd(Vacation vacation) throws Exception {
		return this.baseService.add(vacation);
	}

	@Override
	public void doUpdate(Vacation vacation) throws Exception {
		this.baseService.update(vacation);
	}

	@Override
	public void doDelete(Vacation vacation) throws Exception {
		this.baseService.delete(vacation);
	}

	@Override
	public List<Vacation> toList(Integer userId) throws Exception {
		List<Vacation> list = this.baseService.findByPage("Vacation", new String[]{"userId"}, new String[]{userId.toString()});
		return list;
	}

	@Override
	public Vacation findById(Integer id) throws Exception {
		return this.baseService.getUnique("Vacation", new String[]{"id"}, new String[]{id.toString()});
	}

	@Override
	public List<Vacation> findByStatus(Integer userId, String status, Page<Vacation> page) throws Exception {
		List<Vacation> list = this.baseService.getListPage("Vacation", new String[]{"userId","status"}, new String[]{userId.toString(), status}, page);
		return list;
	}
}
