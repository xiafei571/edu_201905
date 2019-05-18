package edu201905.spring.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201905.spring.domain.DeptInfo;
import edu201905.spring.domain.StudentInfo;

public interface StudentMapper {
	static String column_all = " sid,sname,sex,birth,loc,ethnic ";

	@Select("SELECT" + column_all + "FROM student")
	@ResultMap("studentResultMap")
	List<StudentInfo> getStudentInfoList();

	Integer addStudent(StudentInfo student);
}
