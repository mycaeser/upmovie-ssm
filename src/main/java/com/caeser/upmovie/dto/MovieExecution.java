package com.caeser.upmovie.dto;

import java.util.List;

import com.caeser.upmovie.entity.Movie;
import com.caeser.upmovie.enums.MovieStateEnum;

public class MovieExecution {
	//结果状态
	private int stateCode;
	//状态表示
	private String stateInfo;
	//返回结果
	private List<Movie> movieList;
	
	public MovieExecution(){
		
	}
	
	//失败
	public MovieExecution(MovieStateEnum movieStateEnum){
		this.stateCode=movieStateEnum.getState();
		this.stateInfo=movieStateEnum.getStateInfo();
	}
	
	//成功
	public MovieExecution(MovieStateEnum movieStateEnum,List<Movie> movieListItem){
		this.stateCode=movieStateEnum.getState();
		this.stateInfo=movieStateEnum.getStateInfo();
		this.movieList=movieListItem;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setState(int stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
	

}
