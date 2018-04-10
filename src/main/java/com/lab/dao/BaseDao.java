package com.lab.dao;

import com.lab.protocal.ResultProtocal;

public interface BaseDao<T> {
		
	public ResultProtocal delete(T t);
	
	public ResultProtocal add(T t);
	
	public ResultProtocal update(T t);
	
}
