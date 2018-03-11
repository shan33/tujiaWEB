package com.xls.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/culture")
public class CultureController {

	
	/* get culture infomation
	 * @param: index
	 * @return: the content of the specific page
	 * */
	@RequestMapping("/info")
	public String getCultureInfo() {
		System.out.println("CultureController: ----- getCultureInfo");
//		String getCultureInfo = "select * from culture where";
		return "culture_page";
	}

	/* get culture page comments
	 * @param: index
	 * @return: the content of the specific page comment
	 * */
	@RequestMapping("/comment")
	public String getCultureComment() {
		return "culture_comment";
	}
	
	/* get culture infomation
	 * @param: index
	 * @return: the content of the specific page
	 * */
	@RequestMapping("/moreInfo")
	public String getCultureMoreInfo() {
		return "culture_moreinfo";
	}
	
}
