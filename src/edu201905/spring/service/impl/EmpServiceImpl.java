package edu201905.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu201905.spring.domain.EmpInfo;
import edu201905.spring.model.mapper.EmpMapper;
import edu201905.spring.service.EmpService;

@Component("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<EmpInfo> getEmpList() {
		return empMapper.getEmpInfoList();

	}
}
