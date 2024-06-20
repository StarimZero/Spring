package com.example.dao;

import java.util.*;

import com.example.domain.*;

public interface ProDAO {

	public List<ProVO> list(QueryVO vo);
	//토탈구하기
	public int total();
	
	
	
}
