package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TilesController {

	@RequestMapping(value="/content1", method=RequestMethod.GET)
	public String content1() {		
		return "/tiles/content1"; // tiles.xml 파일의 definition 태그의 name 값과 바인딩 (jsp 파일명 X)
	}
	
	@RequestMapping(value="/content2", method=RequestMethod.GET)
	public ModelAndView content2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/tiles/content2");
		return mv; // tiles.xml 파일의 definition 태그의 name 값과 바인딩 (jsp 파일명 X)
	}
	
	@RequestMapping(value="/content3", method=RequestMethod.GET)
	public ModelAndView content3() {		
		return new ModelAndView("/tiles/content3"); // tiles.xml 파일의 definition 태그의 name 값과 바인딩 (jsp 파일명 X)
	}
	
}
