package com.example;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.*;
import com.example.domain.*;

@SpringBootTest
public class MysqlTest {
	
	@Autowired
	UserDAO dao;
	
	@Autowired
	BBSDAO bdao;
	
	
	@Autowired
	ReplyDAO rdao;
	
	@Autowired
	MessageDAO mdao;
	
	@Autowired
	AccountDAO adao;
	
	@Autowired
	TradeDAO tdao;
	
//	@Test
//	public void read() {
//		dao.read("red");
//	}
	
	
//	@Test
//	public void test() {
//		adao.read("red");
//	}
	
	@Test 
	public void test() {
		adao.read("red");
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
	
	//@Test
	//public void test() {
	//	rdao.total(253);
	//}
//	
//	@Test
//	public void test() {
//		MessageVO vo = new MessageVO();
//		vo.setSender("blue");
//		vo.setReceiver("red");
//		vo.setMessage("홍익아 이번주에 우리집에와라");
//		mdao.insert(vo);
//	}
	
//	@Test
//	public void test() {
//		mdao.readSend(4);
//	}
	
	
//	@Test
//	public void test() {
//		mdao.listSend("blue");
//	}
////	
//	@Test
//	public void test() {
//		mdao.listReceive("red");
//	}
	
//	@Test
//	public void test() {
//		mdao.deleteReceive(9);
//	}
	
//	@Test
//	public void test() {
//		mdao.listDelete("green");
//	}
	
	

	
	
	
}
















