package com.lab.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class user {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="wechatAccount")
	private String wechatAccount;
	
	@Column(name="mobilephone")
	private String mobilephone;
	
	@Column(name="name")
	private String name;
	
	@Column(name="province")
	private String province;
	
	@Column(name="city")
	private String city;
	
	@Column(name="county")
	private String county;
	
	@Column(name="addr")
	private String addr;
	
	@Column(name="permission")
	private Integer permission;
	
	@Column(name="tinyint")
	private Integer tinyint;
	
	@Column(name="integral")
	private Integer integral;
	
	@Column(name="lastLogin")
	private Date lastLogin;
	
	@Column(name="gag")
	private Integer gag;
	
	@Column(name="banner")
	private Integer banner;
	
	@Column(name="openId")
	private String openId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWechatAccount() {
		return wechatAccount;
	}

	public void setWechatAccount(String wechatAccount) {
		this.wechatAccount = wechatAccount;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public Integer getTinyint() {
		return tinyint;
	}

	public void setTinyint(Integer tinyint) {
		this.tinyint = tinyint;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getGag() {
		return gag;
	}

	public void setGag(Integer gag) {
		this.gag = gag;
	}

	public Integer getBanner() {
		return banner;
	}

	public void setBanner(Integer banner) {
		this.banner = banner;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", wechatAccount=" + wechatAccount + ", mobilephone=" + mobilephone + ", name=" + name
				+ ", province=" + province + ", city=" + city + ", county=" + county + ", addr=" + addr
				+ ", permission=" + permission + ", tinyint=" + tinyint + ", integral=" + integral + ", lastLogin="
				+ lastLogin + ", gag=" + gag + ", banner=" + banner + ", openId=" + openId + "]";
	}
	

}
