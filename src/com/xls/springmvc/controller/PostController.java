package com.xls.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostController {
	
	@RequestMapping("/all")
	public String getAll() {
		return "post_all";
	}
	
	@RequestMapping("/info")
	public String getInfo() {
		return "post_info";
	}
	
	@RequestMapping("/comment")
	public String getComment() {
		return "post_comment";
	}
	
	@RequestMapping("/post")
	public String addPost() {
		return "post_post";
	}
}
