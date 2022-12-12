package com.spring.training.board.dao;

import java.util.List;

import com.spring.training.board.dto.BoardDto;

public interface BoardDao {
	public void insertBoard(BoardDto boardDto); // view -> ... -> mapper : 파라미터로 전달
	public List<BoardDto> selectListBoard(); // mapper -> ... -> view : 리턴값으로 전달
}
