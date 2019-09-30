package com.caeser.upmovie.service;

import java.util.List;

import com.caeser.upmovie.dto.MovieExecution;
import com.caeser.upmovie.entity.Movie;

public interface MovieService {
	//通过编号查询一个电影信息
	MovieExecution getMovieById(long id);
	//查询全部电影信息
	List<Movie> getMovieListAll();
	//查询指定范围电影信息
	List<Movie> getMovieByRange(int start,int end);
}
