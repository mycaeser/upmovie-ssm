package com.caeser.upmovie.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Movie {
	//电影编号
	private long id;
	//电影名称
	private String name;
	//备用字段
	private Integer typeLink;
	//语言
	private Integer lang;
	//上映时间
	private Date releaseTime;
	//片长
	private Integer length;
	//简介
	private String content;
	//创建时间
	private Timestamp createTime;
	//更新时间
	private Timestamp updateTime;
	//语言
	private String langName;
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
	public Integer getTypeLink() {
		return typeLink;
	}
	public void setTypeLink(Integer typeLink) {
		this.typeLink = typeLink;
	}
	public Integer getLang() {
		return lang;
	}
	public void setLang(Integer lang) {
		this.lang = lang;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public String getLangName() {
		return langName;
	}
	public void setLangName(String langName) {
		this.langName = langName;
	}
	
}
