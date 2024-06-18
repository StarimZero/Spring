package com.example.service;

import com.example.domain.*;

public interface MessageService {

	public void insert(MessageVO vo);
	//받은거 확인
	public MessageVO readReceive(int mid);
}
