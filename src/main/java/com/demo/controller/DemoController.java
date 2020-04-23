package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@GetMapping("/index")
	public ModelAndView callIndex(ModelAndView mav) {
		mav.setViewName("index");
		System.out.println("DemoController : "+mav);
		return mav;
	}
	//.//
	//Test12
	@GetMapping("/login")
	public ModelAndView callLogin(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	@GetMapping("/register")
	public ModelAndView callRegister(ModelAndView mav) {
		mav.setViewName("register");
		return mav;
	}
	@PostMapping("/result")
	public ModelAndView callResult(ModelAndView mav, HttpServletRequest request) {
		try{
			Map<String, String[]> dataMap = new HashMap<String, String[]>(request.getParameterMap());
			mav.addObject("dataMap", dataMap);
			mav.setViewName("result");
		}

		catch(Exception e)
		{
			System.out.println("Exception Here");
			e.printStackTrace();
		}
		
		return mav;
	}
}
