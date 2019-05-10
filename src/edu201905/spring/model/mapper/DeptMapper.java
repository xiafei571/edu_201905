package edu201905.spring.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201905.spring.domain.DeptInfo;

public interface DeptMapper {
	static String column_all = "deptno, dname, loc";

	@Select("SELECT " + column_all + " FROM dept")
	@ResultMap("deptResultMap")
	List<DeptInfo> getDeptInfoList();
}
