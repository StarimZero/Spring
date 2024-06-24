package com.example.dao;

import java.util.*;

public interface GraphDAO {
	//과목별 평균
	public List<HashMap<String, Object>> lcodeAng();
	//학생별 평균
	public List<HashMap<String, Object>> scodeAvg();
	//과목별 사람수
	public List<HashMap<String, Object>> deptCount();
}
