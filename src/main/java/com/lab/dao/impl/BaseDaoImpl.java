package com.lab.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lab.commons.ErrorEntity;
import com.lab.commons.ResultEnum;
import com.lab.dao.BaseDao;
import com.lab.protocal.ResultProtocal;
import com.lab.protocal.impl.ResultFactoryImpl;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Autowired
	private SessionFactory sf;

	@Autowired
	private ResultFactoryImpl rfi;
	
	private Class<T> clazz;//创建一个Class对象来获取泛型的class

	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	@Override
	public Session getSession() {
		return sf.getCurrentSession();
	}
	
	@Override
	public ResultProtocal delete(T t) {
		try {	
			return rfi.assemble( this.getSession().save(t), ResultEnum.OK,Long.class);
		}catch(Exception e) {
			e.printStackTrace();
			return rfi.assemble(ErrorEntity.getError(),ResultEnum.ERROR,Long.class);
		}
	}

	@Override
	public ResultProtocal add(T t) {
		// TODO Auto-generated method stub
		try {	
			return rfi.assemble( this.getSession().save(t), ResultEnum.OK,Long.class);
		}catch(Exception e) {
			e.printStackTrace();
			return rfi.assemble(ErrorEntity.getError(),ResultEnum.ERROR,Long.class);
		}
	}

	@Override
	public ResultProtocal update(Object t) {
		// TODO Auto-generated method stub
		try {	
			this.getSession().update(t);
			return rfi.assemble(ResultEnum.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return rfi.assemble(ErrorEntity.getError(),ResultEnum.ERROR,Long.class);
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public ResultProtocal delete(Serializable id) {
		T t = (T) this.get(id).getResultEntity();
		getSession().delete(t);
		return rfi.assemble(ResultEnum.OK);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResultProtocal get(Serializable id) {
		
		return rfi.assemble((T) getSession().get(clazz,id), ResultEnum.OK,clazz);
		
	}

}
