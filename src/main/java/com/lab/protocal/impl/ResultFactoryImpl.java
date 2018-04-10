package com.lab.protocal.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.lab.commons.ResultEnum;
import com.lab.protocal.ResultFactoryProtocal;
import com.lab.protocal.ResultProtocal;

import junit.framework.Assert;

@SuppressWarnings("rawtypes")
public class ResultFactoryImpl implements ResultFactoryProtocal {
	
	@Autowired
	private ResultProtocalImpl rp;
	
	@Override
	public ResultProtocal assemble(Object obj,ResultEnum result,  Class clazz) {

		Assert.assertNotNull(rp);
		rp.setResultCode(result.getCode());
		rp.setResultMsg(result.getMsg());
		rp.setResultEntity(obj);
		rp.setClazz(clazz);
		return rp;
		
	}

	public ResultProtocal assemble(ResultEnum result) {
		// TODO Auto-generated method stub
		Assert.assertNotNull(rp);
		rp.setResultCode(result.getCode());
		rp.setResultMsg(result.getMsg());
		rp.setResultEntity(null);
		rp.setClazz(null);
		return rp;
	}

}
