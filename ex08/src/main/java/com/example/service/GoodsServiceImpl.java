package com.example.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.GoodsDAO;
import com.example.domain.GoodsVO;
import com.example.domain.QueryVO;


@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	GoodsDAO dao;

	@Transactional
	@Override
	public int insert(GoodsVO vo) {
		GoodsVO goods = dao.read(vo.getGid());
		if(goods==null) {
			dao.insert(vo);
			return 1;
		}else {
			return 0;
		}
	}

	@Transactional
	@Override
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total());
		return map;
	}

	@Transactional
	@Override
	public int insertRelated(String gid, String rid) {
		int count = dao.countRealate(gid, rid);
		if(count==0) dao.insertRelated(gid, rid);
		return count;
	}

}
