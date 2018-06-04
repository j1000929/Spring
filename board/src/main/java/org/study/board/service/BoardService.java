package org.study.board.service;

import java.util.List;

import org.study.board.model.BoardVO;

public interface BoardService {
	
	public void regist(BoardVO vo)throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(Integer bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	
	

}
