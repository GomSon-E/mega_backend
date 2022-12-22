package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tiles/bootstrap")
public class BootstrapController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "/bootstrap/index";
	}
}
