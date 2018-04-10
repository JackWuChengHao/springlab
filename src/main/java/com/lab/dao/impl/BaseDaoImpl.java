package com.lab.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lab.commons.ErrorEntity;
import com.lab.commons.ResultEnum;
import com.lab.dao.BaseDao;
import com.lab.protocal.ResultFactoryProtocal;
import com.lab.protocal.ResultProtocal;
import com.lab.protocal.impl.ResultFactoryImpl;

public class BaseDaoImpl implements BaseDao<Object> {

	@Autowired
	private SessionFactory sf;

	@Autowired
	private ResultFactoryImpl rfi;

	private Session getSession() {
		return sf.openSession();
	}

	@Override
	public ResultProtocal delete(Object t) {
		try {	
			return rfi.assemble( this.getSession().save(t), ResultEnum.OK,Long.class);
		}catch(Exception e) {
			e.printStackTrace();
			return rfi.assemble(ErrorEntity.getError(),ResultEnum.ERROR,Long.class);
		}
	}

	@Override
	public ResultProtocal add(Object t) {
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


}
