package com.caeser.upmovie.util;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtil {
	/** 根据前端传过来信息获取指定key的value **/
	public static int getInt(HttpServletRequest request,String key) {
		try {
			return Integer.decode(request.getParameter(key));
		}catch(Exception e) {
			return -1;
		}
	}
	
	public static Long getLong(HttpServletRequest request,String key) {
		try {
			return Long.decode(request.getParameter(key));
		}catch(Exception e) {
			return -1L;
		}
	}
	public static Double getDouble(HttpServletRequest request,String key) {
		try {
			return Double.valueOf(request.getParameter(key));
		}catch(Exception e) {
			return -1d;
		}
	}
	public static boolean getBoolean(HttpServletRequest request,String key) {
		try {
			return Boolean.valueOf(request.getParameter(key));
		}catch(Exception e) {
			return false;
		}
	}
	public static String getString(HttpServletRequest request,String key) {
		try {
			String result=request.getParameter(key);
			if(result!=null) {
				result=result.trim();
			}
			if("".equals(result)) {
				result=null;
			}
			return result;
		}catch(Exception e) {
			return null;
		}
	}
}
