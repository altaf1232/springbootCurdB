package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//here is mapping your controller
@Controller
public class MainController 
{
	//here is mapping your Request
   @RequestMapping("/")
   public String home() 
   {
	   return "home";
   }
}
