package edu201905.spring.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu201905.spring.domain.LoginInfo;
import edu201905.spring.domain.UserInfo;
import edu201905.spring.model.mapper.UserMapper;
import edu201905.spring.service.UserService;
import edu201905.util.MD5Util;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserInfo getUser(String loginId) {
		return userMapper.getUserByLoginId(loginId);
	}

	@Override
	public boolean loginValid(LoginInfo login, HttpSession session) {
		// 1.先去数据库中查找用户信息，根据loginId
		UserInfo user = getUser(login.getLoginId());
		if (null != user) {
			// 2.查到该用户，做密码比较
			if (user.getPassword().equals(MD5Util.textToMD5U16(login.getPassword()))) {
				// 3.密码一致
				login.setUsername(user.getUserName());
				session.setAttribute("USER_SESSION", login);
				return true;
			}
		}
		// 4.密码不一致
		return false;
	}

}
