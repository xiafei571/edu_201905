package edu201905.spring.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201905.spring.domain.StudentInfo;

public interface StudentMapper {
	static String column_all = " sid,sname,sex,birth,loc,ethnic ";

	@Select("SELECT" + column_all + "FROM student")
	@ResultMap("studentResultMap")
	List<StudentInfo> getStudentInfoList();

	Integer addStudent(StudentInfo student);

	@Select("SELECT " + column_all + " FROM student WHERE sid = #{id}")
	@ResultMap("studentResultMap")
	StudentInfo getStudentById(@Param("id") Integer id);

	Integer updateStudent(StudentInfo student);

	@Delete("DELETE FROM student WHERE sid = #{id}")
	Integer deleteStudent(@Param("id") Integer id);

}
