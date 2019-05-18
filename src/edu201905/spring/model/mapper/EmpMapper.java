package edu201905.spring.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201905.spring.domain.EmpInfo;

public interface EmpMapper {

	static String column_all = "empno,ename,job,mgr,hiredate,sal,deptno	";

	@Select("SELECT " + column_all + " FROM emp")
	@ResultMap("empResultMap")
	List<EmpInfo> getEmpInfoList();

	Integer addEmp(EmpInfo emp);

}
