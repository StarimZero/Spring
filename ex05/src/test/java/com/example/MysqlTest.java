package com.example;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BBSDAO;
import com.example.dao.ReplyDAO;
import com.example.dao.UserDAO;
import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

@SpringBootTest
public class MysqlTest {
	
	@Autowired
	UserDAO dao;
	
	@Autowired
	BBSDAO bdao;
	
	
	@Autowired
	ReplyDAO rdao;
	
	@Test
	public void read() {
		dao.read("red");
	}
	
	// @Test
	//public void test() {
	//	bdao.read(1);
	// }
	
	//@Test
	//public void test() {
	//	bdao.updateViewcnt(120);
	//}

	//@Test
	//public void test() {
	//	ReplyVO vo = new ReplyVO();
	//	vo.setBid(120);
	//	vo.setUid("red");
	//	vo.setContents("삼성SDI는....");
	//	rdao.insert(vo);
	//}
	
//	
//	@Test
//	public void test() {
//		QueryVO vo = new QueryVO();
//		vo.setPage(1);
//		vo.setSize(3);
//		rdao.list(vo, 253);
//	}
	
	@Test
	public void test() {
		rdao.total(253);
	}
}
















