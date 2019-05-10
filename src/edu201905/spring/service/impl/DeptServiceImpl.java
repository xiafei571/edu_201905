package edu201905.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu201905.spring.domain.DeptInfo;
import edu201905.spring.model.mapper.DeptMapper;
import edu201905.spring.service.DeptService;

@Component("deptService")
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<DeptInfo> getDeptList() {
		return deptMapper.getDeptInfoList();
	}

}
