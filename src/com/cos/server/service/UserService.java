package com.cos.server.service;

import java.util.List;

import com.cos.server.domain.user.User;
import com.cos.server.domain.user.UserDao;
import com.cos.server.domain.user.dto.JoinReqDto;
import com.cos.server.domain.user.dto.LoginReqDto;
import com.cos.server.service.*;

public class UserService {

	//회원가입, 중복체크, 로그인
	//admin로그인 시 모든정보 삭제 가능
	
	private UserDao userDao = null;
	public UserService() {
		userDao = new UserDao();
	}
	
	public int 회원가입(JoinReqDto dto) {
		return userDao.save(dto);
	}
	
	public User 로그인(LoginReqDto dto) {
		return userDao.findByUsernameAndPassword(dto);
	}
	
	public int 유저네임중복체크(String username) {
		return userDao.findByUsername(username);
	}
	public List<User> 유저목록보기(){
		return userDao.findAll();
	}
	
	public int 유저삭제(int id) {
		return userDao.deleteById(id);
	}
}
