package com.lab.protocal;

import com.lab.commons.ResultEnum;

@SuppressWarnings("rawtypes")
public interface ResultFactoryProtocal extends Factory{
	
	/**
	 * 生成结果对象
	 * @param obj
	 * @param clazz
	 * @return
	 */
	public ResultProtocal assemble(Object obj,ResultEnum result ,Class clazz);
	
}
