package com.lab.dao;

import java.io.Serializable;

import org.hibernate.Session;

import com.lab.protocal.ResultProtocal;

public interface BaseDao<T> {
	
	public Session getSession();

	public ResultProtocal update(T t);//更新对象
	
	public ResultProtocal delete(Serializable id);//根据id删除对象
	
	public ResultProtocal get(Serializable id);//根据id获取对象

	ResultProtocal delete(T t);

	ResultProtocal add(T t);
	
}
