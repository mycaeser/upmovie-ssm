package com.caeser.upmovie.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caeser.upmovie.dao.MovieDao;
import com.caeser.upmovie.dto.MovieExecution;
import com.caeser.upmovie.entity.Movie;
import com.caeser.upmovie.enums.MovieStateEnum;
import com.caeser.upmovie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieDao movieDao;
	
	@Override
	public MovieExecution getMovieById(long id){
		Movie movie=movieDao.getMovieById(id);
		MovieExecution movieExecution=null;
		if(movie==null){
			//失败
			movieExecution=new MovieExecution(MovieStateEnum.NOTEXIT);
		}else{
			//成功
			List<Movie> movies=new ArrayList<Movie>();
			movies.add(movie);
			movieExecution=new MovieExecution(MovieStateEnum.SUC,movies);
		}
		return movieExecution;
	}
	
	@Override
	public List<Movie> getMovieListAll(){
		List<Movie> movieList=movieDao.getMovieListAll();
		return movieList;
	}
	
	@Override
	public List<Movie> getMovieByRange(int start,int end){
		List<Movie> movieList=movieDao.getMovieListByRange(start, end);
		return movieList;
	}
}
