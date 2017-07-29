package com.evan.oa.service;

import com.evan.oa.entity.SuperviseReceive;
import com.evan.oa.pagination.Page;

import java.util.List;

public interface ISuperviseReceiveService {

	public List<SuperviseReceive> getListPage(Page<SuperviseReceive> page) throws Exception;
}
