package com.example.dao;

import java.util.List;

import com.example.domain.QueryVO;
import com.example.domain.StuVO;

public interface StuDAO {

	
	//학생목록구하기
	public List<StuVO> list(QueryVO vo);
	//토탈구하기
	public int total(QueryVO vo);
	//등록할 학생의 코드알기
	public String getcode(String yy, String dept);
	//학생등록하기
	public void insert(StuVO vo);
	//학생정보보기
	public StuVO read(String scode);
	//학생삭제하기
	public void delete(String scode);
	//학생정보업디이트
	public void update(StuVO vo);
}
