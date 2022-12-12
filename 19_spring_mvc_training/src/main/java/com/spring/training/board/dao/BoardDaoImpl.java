package com.spring.training.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.training.board.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertBoard(BoardDto boardDto) {
		sqlSession.insert("board.insertBoard", boardDto);
		
	}

	@Override
	public List<BoardDto> selectListBoard() {
		
		return sqlSession.selectList("board.selectListBoard");
	}
	
}
