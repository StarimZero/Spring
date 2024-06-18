package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MessageDAO;
import com.example.dao.UserDAO;
import com.example.domain.MessageVO;


@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	UserDAO udao;
	
	@Autowired
	MessageDAO mdao;
	
	@Transactional
	@Override
	public void insert(MessageVO vo) {
		mdao.insert(vo);
		udao.updatePoint(vo.getSender(), 10);
		
	}

	@Transactional
	@Override
	public MessageVO readReceive(int mid) {
		MessageVO vo = mdao.readReceive(mid);
		if(vo.getReadDate()==null) {
			udao.updatePoint(vo.getReceiver(), 5);
			mdao.updateReadDate(mid);
		}
		return vo;
	}

}
