package com.example.dao;
import com.example.domain.*;

public interface UserDAO {
	public UserVO read(String uid);
	//유저정보수정
	public void update(UserVO vo);
	//유저사진수정
	public void updatePhoto(String photo, String uid);
	//비밀번호 변경
	public void updatePass(String upass, String uid);
}