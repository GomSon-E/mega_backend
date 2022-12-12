package com.spring.training.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.training.board.dto.BoardDto;
import com.spring.training.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	// 서비스 연결하기
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/boardWrite", method=RequestMethod.GET)
	public ModelAndView boardwrite() {
		return new ModelAndView("board/bWrite");
	}
	
	// boardWrite 입력값 받아서 처리하기
	@RequestMapping(value="/boardWrite", method=RequestMethod.POST)
	public @ResponseBody String boardWrite(@ModelAttribute BoardDto boardDto, HttpServletRequest request) {
		
		boardService.addBoard(boardDto);
		
		String jsScript = "<script>";
			   jsScript += "alert('Post Added');";
			   jsScript += "location.href='" + request.getContextPath() + "/board/boardList';";
			   jsScript += "</script>";
		return jsScript;
	}
	
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public ModelAndView boardList() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/bList");
		mv.addObject("boardList", boardService.getBoardList()); // 디비에서 가져온 데이터를 bList로 보냄 
		return mv;
	}
 	
}
