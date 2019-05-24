package edu201905.spring.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu201905.common.page.Pagination;
import edu201905.common.page.PaginationResult;
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

	@Override
	public PaginationResult<List<DeptInfo>> getDeptList(Integer pageIndex, Integer pageSize) {
		Integer count = deptMapper.getDeptCount();
		Pagination pagination1 = new Pagination(pageIndex, pageSize);
		pagination1.setTotalCount(count);

		List<DeptInfo> deptList = deptMapper.getDeptPage(pagination1.getCursor(), pagination1.getOffset());
		PaginationResult<List<DeptInfo>> result = new PaginationResult<List<DeptInfo>>(pagination1, deptList);
		return result;
	}

	@Override
	public Integer addDept(DeptInfo dept) {
		return deptMapper.addDept(dept);
	}

	@Override
	public Integer updateDept(DeptInfo dept) {
		return deptMapper.updateDept(dept);
	}

	@Override
	public Integer deleteDept(Integer deptInfo) {
		return deptMapper.deleteDept(deptInfo);
	}

	@Override
	public DeptInfo getDeptInfoById(Integer id) {
		return deptMapper.getDeptInfoById(id);
	}

	@Override
	public List<Map<String, Object>> getDeptGroupByLoc() {
		return deptMapper.getDeptGroupByLoc();
	}

}
