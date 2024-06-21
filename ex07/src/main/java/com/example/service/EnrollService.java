package com.example.service;

import com.example.domain.EnrollVO;

public interface EnrollService {
	
	//수강신청등록
	public int insert(EnrollVO vo);
	
	//수간신청취소
	public void delete(EnrollVO vo);

}
