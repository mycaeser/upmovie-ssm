package com.caeser.upmovie.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caeser.upmovie.entity.Movie;
import com.caeser.upmovie.service.MovieService;
import com.caeser.upmovie.util.HttpServletRequestUtil;



@Controller
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> getMV( HttpServletRequest request){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		long moveId=HttpServletRequestUtil.getLong(request, "id");
		Movie movie=movieService.getMovieById(moveId);
		modelMap.put("movie",movie);
		return modelMap;
	}
}
