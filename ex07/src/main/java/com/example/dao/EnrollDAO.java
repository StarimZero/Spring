package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.EnrollVO;

public interface EnrollDAO {
	
	//수강신청 목록
	public List<HashMap<String, Object>> scodeList(String scode);
	
	//이미수강되어있는지
	public int check(EnrollVO vo);
	//수강신청하기
	public void insert(EnrollVO vo);
	//수강신청취소하기
	public void delete(EnrollVO vo);
	//누가누강청했는지
	public List<HashMap<String, Object>> lcodeList(String lcode);
	//점수수정
	public void update(EnrollVO vo);
}
