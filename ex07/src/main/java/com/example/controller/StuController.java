package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.StuDAO;
import com.example.domain.QueryVO;
import com.example.domain.StuVO;
import com.example.service.StuService;

@RestController
@RequestMapping("/stu")


public class StuController {

	@Autowired
	StuDAO dao;
	
	@Autowired
	StuService service;
	
	
	
	@GetMapping("") //테스트 /stu?page=1&size=4key=pname&word=광
	public HashMap<String, Object> list (QueryVO vo){
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}
	
	
	@PostMapping("/insert")
	public void insert(@RequestBody StuVO vo) {
		service.insert(vo);
	}
	
	@GetMapping("/{scode}") //테스트 /stu/24454001
	public StuVO read(@PathVariable("scode") String scode){
		return dao.read(scode);
	}
	
	@PostMapping("/delete/{scode}") //테스트 /stu/delete/24454001
	public void delete(@PathVariable("scode") String scode) {
		dao.delete(scode);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody StuVO vo) {
		dao.update(vo);
	}
	
}
