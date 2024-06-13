package com.example.dao;

import java.util.*;

import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

	public interface ReplyDAO {
		//댓글넣기
		public void insert(ReplyVO vo);
		//댓글리스트
		public List<HashMap<String, Object>> list(QueryVO vo, int bid);
		//토탈구하기
		public int total(int bid);
		//삭제하기
		public void delete(int rid);
		//수정하기
		public void update(ReplyVO vo);
		//읽어오기
		public ReplyVO read(int rid);
	
}
