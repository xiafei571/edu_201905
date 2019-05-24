package edu201905.spring.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201905.spring.domain.DeptInfo;

public interface DeptMapper {
	static String column_all = "deptno, dname, loc";

	@Select("SELECT " + column_all + " FROM dept")
	@ResultMap("deptResultMap")
	List<DeptInfo> getDeptInfoList();

	@Select("SELECT COUNT(*) FROM dept")
	Integer getDeptCount();

	@Select("SELECT * FROM dept ORDER BY deptno DESC LIMIT #{cursor}, #{offset}")
	@ResultMap("deptResultMap")
	List<DeptInfo> getDeptPage(@Param("cursor") Integer cursor, @Param("offset") Integer offset);

	Integer addDept(DeptInfo dept);

	Integer updateDept(DeptInfo dept);

	@Delete("DELETE FROM dept WHERE deptno = #{id}")
	Integer deleteDept(@Param("id") Integer id);

	@Select("SELECT " + column_all + " FROM dept WHERE deptno = #{id}")
	@ResultMap("deptResultMap")
	DeptInfo getDeptInfoById(@Param("id") Integer id);

	List<Map<String, Object>> getDeptGroupByLoc();
}
