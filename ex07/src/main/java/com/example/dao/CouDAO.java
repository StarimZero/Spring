package com.example.dao;

import java.util.List;

import com.example.domain.CouVO;
import com.example.domain.QueryVO;

public interface CouDAO {
	//강좌 목록들고오기
	public List<CouVO> list(QueryVO vo);
	
	//강좌 코드 가져오기
	public String getlcode(String dept);
	
	//강좌 입력하기
	public void insert(CouVO vo);
	
	//강좌 읽기
	public CouVO read(String lcode);
	
	//강좌 삭제
	public void delete(String lcode);
	
	//수정하기
	public void update(CouVO vo);
	
	//토탈구하기
	public int total();
	
	//수강신청에맞는 인원표출
	public void updatePersons(String lcode, int amount);
	
	//사진 업로드
	public void updatePhoto(CouVO vo);
}
