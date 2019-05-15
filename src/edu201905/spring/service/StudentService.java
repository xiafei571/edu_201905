package edu201905.spring.service;

import java.util.List;

import edu201905.spring.domain.DeptInfo;
import edu201905.spring.domain.StudentInfo;

public interface StudentService {

	List<StudentInfo> getStudentList();

	Integer addStudent(DeptInfo student);

	Integer updateStudent(DeptInfo student);

	Integer deleteStudent(Integer student);

}
