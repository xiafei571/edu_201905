package edu201905.spring.service;

import java.util.List;

import edu201905.spring.domain.StudentInfo;

public interface StudentService {

	List<StudentInfo> getStudentList();

	Integer addStudent(StudentInfo student);
	
	StudentInfo getStudentById(Integer id);
}
