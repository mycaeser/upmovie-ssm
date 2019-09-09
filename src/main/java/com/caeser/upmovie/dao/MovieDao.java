package com.caeser.upmovie.dao;

import java.util.List;

import com.caeser.upmovie.entity.Movie;

public interface MovieDao {
	/* 通过 ID 获取电影 */
	Movie getMovieById(long id);
	/* 获得全部电影 */
	List<Movie> getMovieListAll();
	/* 通编号范围查询 */
	List<Movie> getMovieListByRange(int start,int end);
}
