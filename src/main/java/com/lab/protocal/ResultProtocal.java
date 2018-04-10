package com.lab.protocal;

@SuppressWarnings("rawtypes")
public abstract class ResultProtocal implements Protocal {
	
	public String ResultCode;
	
	public String ResultMsg;
	
	public Object ResultEntity;
	
	public Class clazz;
	
	
	public Class getClazz() {
		return clazz;
	}


	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}


	public String getResultCode() {
		return ResultCode;
	}

		
	public void setResultCode(String resultCode) {
		ResultCode = resultCode;
	}

	public String getResultMsg() {
		return ResultMsg;
	}

	public void setResultMsg(String resultMsg) {
		ResultMsg = resultMsg;
	}

	public Object getResultEntity() {
		return ResultEntity;
	}

	public void setResultEntity(Object resultEntity) {
		ResultEntity = resultEntity;
	}


	@Override
	public String toString() {
		return "ResultProtocalImpl [ResultCode=" + ResultCode + ", ResultMsg=" + ResultMsg + ", ResultEntity="
				+ ResultEntity + ", clazz=" + clazz + "]";
	}
}
