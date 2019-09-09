package com.caeser.upmovie.entity;

import java.sql.Timestamp;

public class Lang {
	//语言编号
	private long id;
	//语言名称
	private String name;
	//创建时间
	private Timestamp createTime;
	//更新时间
	private Timestamp updateTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
}
