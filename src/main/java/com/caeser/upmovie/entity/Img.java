package com.caeser.upmovie.entity;

import java.sql.Timestamp;

public class Img {
	//图片编号
	private long id;
	//图片名称
	private String name;
	//是否存在本地 1本地 0网络
	private Integer from;
	//图片 URL 地址
	private String URL;
	//创建时间
	private Timestamp createTime;
	//修改时间
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
	public Integer getFrom() {
		return from;
	}
	public void setFrom(Integer from) {
		this.from = from;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
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
