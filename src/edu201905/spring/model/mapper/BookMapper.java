package edu201905.spring.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201905.spring.domain.BookInfo;
import edu201905.spring.domain.DeptInfo;
import edu201905.spring.domain.StudentInfo;

public interface BookMapper {
	static String column_all = " bookId,bname,btype,price,author ";

	@Select("SELECT" + column_all + "FROM book")
	@ResultMap("bookResultMap")
	List<BookInfo> getBookInfoList();

}
