package com.example.dao;

import java.util.List;

import com.example.domain.ReviewVO;

public interface ReviewDAO {
	
	//리뷰목록
	public List<ReviewVO> list(String gid);
	//리뷰작성하기
	public void insert(ReviewVO vo);
	//리뷰지우기
	public void delete(int rid);
	//리뷰수정
	public void update(ReviewVO vo);
	
	

}
