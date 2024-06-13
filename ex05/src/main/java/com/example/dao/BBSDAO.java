package com.example.dao;

import java.util.*;
import com.example.domain.*;

public interface BBSDAO {
	//게시판 리스트
	public List<HashMap<String,Object>> list(QueryVO vo);
	//토탈구하는거
	public int total(QueryVO vo);
	//게시물 읽기
	public BBSVO read(int bid);
	//게시물 삭제
	public void delete(int bid);
	//게수물 수정
	public void update(BBSVO vo);
	//글쓰기
	public void insert(BBSVO vo);
	//조회수 올리기
	public void updateViewcnt(int bid);
	//조회수 연동하기 
	public void updateReplycnt(int bid, int amount);
}