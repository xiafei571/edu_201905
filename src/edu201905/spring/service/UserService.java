package edu201905.spring.service;

import javax.servlet.http.HttpSession;

import edu201905.spring.domain.LoginInfo;
import edu201905.spring.domain.UserInfo;

public interface UserService {

	UserInfo getUser(String loginId);

	boolean loginValid(LoginInfo login, HttpSession session);
}
