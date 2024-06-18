package com.example.dao;

import java.util.List;

import com.example.domain.*;

public interface MessageDAO {
	
	//메시지보내기
	public void insert(MessageVO vo);
	
	//메세지 보낸거 확인
	public MessageVO readSend(int mid);
	
	//메세지 받은거 확인
	public MessageVO readReceive(int mid);
	
	//읽은 시간 확인
	public void updateReadDate(int mid);
	
	//메세지리스트
	public List<MessageVO> listSend(String sender);
	
	//받은 메세지 리스트
	public List<MessageVO> listReceive(String receiver);
	
	//받은메세지 휴지통으로
	public void deleteReceive(int mid);
	
	//보낸메세지 휴지통으로
	public void deleteSend(int mid);
	
	//받은 메세지 리스트
	public List<MessageVO> listDelete(String uid);
	
	//휴지통에있는 메세지 복원하기
	public void resetDelete(int mid, String type);
	
}

