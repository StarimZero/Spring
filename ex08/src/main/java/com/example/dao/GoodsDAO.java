package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.*;

public interface GoodsDAO {
	
	//상품넣기
	public void insert(GoodsVO vo);
	//상품읽기
	public GoodsVO read(String gid);
	//상품리스트
	public List<HashMap<String, Object>> list(QueryVO vo);
	//상품토탈갯수
	public int total();
	//상품삭제
	public void delete(String gid);
	//상품업데이트
	public void updqte(GoodsVO vo);
	//이미지 업데이트
	public void updateImage(GoodsVO vo);
	//글 추가하기 
	public void updateContents(GoodsVO vo);
	//이미지 테이블에 넣기
	public void insertAttach(AttachVO vo);
	//이미지 테이블 리스트 뽑기
	public List<AttachVO> listAttach(String gid);
	//테이블에서 삭제
	public void deleteAttach(int aid);
	//관련상품넣기
	public void insertRelated(String gid, String rid);
	//상품있나없나 살펴보기
	public int countRealate(String gid, String rid);
	//관련상품출력
	public List<HashMap<String, Object>> listRelated(String gid);
	//관련상품삭제
	public void deleteRelated(String rid, String gid);
}
