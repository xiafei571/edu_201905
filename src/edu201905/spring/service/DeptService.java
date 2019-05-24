package edu201905.spring.service;

import java.util.List;
import java.util.Map;

import edu201905.common.page.PaginationResult;
import edu201905.spring.domain.DeptInfo;

public interface DeptService {

	List<DeptInfo> getDeptList();

	PaginationResult<List<DeptInfo>> getDeptList(Integer pageIndex, Integer pageSize);

	Integer addDept(DeptInfo dept);

	Integer updateDept(DeptInfo dept);

	Integer deleteDept(Integer deptInfo);

	DeptInfo getDeptInfoById(Integer id);

	List<Map<String, Object>> getDeptGroupByLoc();
}
