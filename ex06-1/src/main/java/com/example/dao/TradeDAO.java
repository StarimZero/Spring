package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.TradeVO;

public interface TradeDAO {

	
	// 거래내역
	public List<HashMap<String, Object>> list(String ano);
	
	// 거래내역입력
	public void insert(TradeVO vo);
	
	

}
