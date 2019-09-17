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
import com.caeser.upmovie.enums.MovieStateEnum;
import com.caeser.upmovie.service.MovieService;
import com.caeser.upmovie.util.HttpServletRequestUtil;
import com.caeser.upmovie.util.UrlReturnMsg;



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
		if(movie==null){
			//如果没查询到结果
			modelMap.put(UrlReturnMsg.stateCode, MovieStateEnum.NOTEXIT.getState());
			modelMap.put(UrlReturnMsg.errorMsg, MovieStateEnum.NOTEXIT.getStateInfo());
		}else{
			modelMap.put("movie",movie);
		}
		
		return modelMap;
	}
}
