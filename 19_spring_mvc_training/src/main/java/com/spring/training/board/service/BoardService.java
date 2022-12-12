package com.spring.training.board.service;

import java.util.List;

import com.spring.training.board.dto.BoardDto;

public interface BoardService {

	public void addBoard(BoardDto boardDto);
	public List<BoardDto> getBoardList();
	
}
