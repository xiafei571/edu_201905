package edu201905.spring.service;

import java.util.List;

import edu201905.spring.domain.EmpInfo;

public interface EmpService {

	List<EmpInfo> getEmpList();
	
	Integer addEmp(EmpInfo emp);
	
	EmpInfo getEmpById(Integer id);

}
