package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoController {

	@RequestMapping(value ="/video")
	public String sayHello (Model model) {
		
		model.addAttribute("video", "Hello Video World");
		
		return "video";
	}
	
	
}
