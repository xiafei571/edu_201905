package edu201905.spring.service;

import java.util.List;

import edu201905.spring.domain.DeptInfo;

public interface DeptService {

	List<DeptInfo> getDeptList();

	Integer addDept(DeptInfo dept);

	Integer updateDept(DeptInfo dept);
	
	Integer deleteDept(Integer deptInfo);

}
