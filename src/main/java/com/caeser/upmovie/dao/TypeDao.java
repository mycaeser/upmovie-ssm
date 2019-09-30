package com.caeser.upmovie.dao;

import java.util.List;

import com.caeser.upmovie.entity.Type;

public interface TypeDao {
	Type getTypeByid(long id);
	List<Type> getTypeListAll();
	List<Type> getTypeListByRange(int start,int end);
}
