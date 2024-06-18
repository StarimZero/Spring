package com.example.dao;
import java.util.List;

import com.example.domain.*;

public interface UserDAO {
	public UserVO read(String uid);
	//유저정보수정
	public void update(UserVO vo);
	//유저사진수정
	public void updatePhoto(String photo, String uid);
	//비밀번호 변경
	public void updatePass(String upass, String uid);
	//ㅎ포인트 업데이트
	public void updatePoint(String uid, int amout) ;
	//유저 목록 출력
	public List<UserVO> list();
}