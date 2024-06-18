package com.example.dao;

import java.util.*;

import com.example.domain.*;

public interface AccountDAO {
	
	
	//계좌 리스트 가져오기
	public List<AccountVO> list();
	//계좌 정보 읽기
	public AccountVO read(String uid);
	//계좌 밸런스 업데이트하기
	public void update(String ano, double amount);
	
}
