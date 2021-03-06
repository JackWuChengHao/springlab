package com.lab.commons;

public enum ResultEnum {
	
	OK("0","成功"),ERROR("-1","失败");
	
	private String code;
	
	private String msg;
	
	private ResultEnum(String code,String msg) {
		this.code = code;
		this.msg  = msg;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

}
