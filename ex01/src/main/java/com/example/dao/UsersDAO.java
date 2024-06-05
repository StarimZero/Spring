package com.example.dao;

import java.util.*;

public interface UsersDAO {
	public List<HashMap<String, Object>> list(); //키는 STring일것이고 ㅇobjcet는 아무거나 
	public HashMap<String, Object> read(String uid);
}
