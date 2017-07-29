package com.evan.oa.service.impl;

import com.evan.oa.entity.SuperviseReceive;
import com.evan.oa.pagination.Page;
import com.evan.oa.service.IBaseService;
import com.evan.oa.service.ISuperviseReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperviseReceiveServiceImpl implements ISuperviseReceiveService {
	
	@Autowired
	private IBaseService<SuperviseReceive> baseService;

	@Override
	public List<SuperviseReceive> getListPage(Page<SuperviseReceive> page) throws Exception {
		return this.baseService.getListPage("SuperviseReceive", new String[]{}, new String[]{}, page);
	}

}
