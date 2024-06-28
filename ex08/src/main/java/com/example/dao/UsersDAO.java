package com.example.dao;

import com.example.domain.UserVO;

public interface UsersDAO {
	//회원가입하기
	public void insert(UserVO vo);
	//로그인을위한 읽기
	public UserVO read(String uid);
}
