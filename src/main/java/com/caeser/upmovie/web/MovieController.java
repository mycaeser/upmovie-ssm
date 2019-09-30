package com.caeser.upmovie.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.caeser.upmovie.dto.MovieExecution;


import com.caeser.upmovie.service.MovieService;



@Controller
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> getbyid( HttpServletRequest request,@PathVariable(value="id")int idnum,HttpServletResponse response){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		MovieExecution movieExe=movieService.getMovieById(idnum);
		if(movieExe==null){
			//如果没查询到结果
			response.setStatus(404);
		}
		modelMap.put("movie", movieExe);
		return modelMap;
	}
}
