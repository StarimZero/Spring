package com.example.service;

import java.util.HashMap;

import com.example.domain.GoodsVO;
import com.example.domain.QueryVO;

public interface GoodsService {
	
	//입력하기
	public int insert (GoodsVO vo);
	//리스트 
	public HashMap<String, Object> list(QueryVO vo);
	
	//관련상품등록하기
	public int insertRelated(String gid, String rid);
}
