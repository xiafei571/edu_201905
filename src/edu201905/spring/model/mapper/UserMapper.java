package edu201905.spring.model.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu201905.spring.domain.UserInfo;

public interface UserMapper {

	@Select("select * from user where loginId=#{id} and valid = 1")
	@ResultMap("userResultMap")
	UserInfo getUserByLoginId(@Param("id") String id);
}
