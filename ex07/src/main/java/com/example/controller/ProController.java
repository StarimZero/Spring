package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProDAO;
import com.example.domain.ProVO;
import com.example.domain.QueryVO;

@RestController
@RequestMapping("/pro")
public class ProController {
	
	
	@Autowired
	ProDAO dao;
	
	@GetMapping("") //테스트 /pro?page=1&size=3&word= // 워드는 교수가 같은학과 보이기 하고나서 추가한것.
	public HashMap<String, Object> list(QueryVO vo){
		HashMap<String, Object> map = new HashMap<>();
		map.put("total", dao.total());
		map.put("list", dao.list(vo));
		return map;
	}

}
