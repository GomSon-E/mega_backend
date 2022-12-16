package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles/member")
public class MemberController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "/tiles/member/login";
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail() {
		return "/tiles/member/detail";
	}
	
	@RequestMapping(value="/cart", method=RequestMethod.GET)
	public ModelAndView cart() {
		return new ModelAndView("/tiles/member/cart");
	}

	@RequestMapping(value="/myPage", method=RequestMethod.GET)
	public ModelAndView myPage() {
		return new ModelAndView("/tiles/member/myPage");
	}
}
