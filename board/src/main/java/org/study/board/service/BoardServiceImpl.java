package org.study.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.study.board.model.BoardVO;
import org.study.board.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;
	
	@Override
	public void regist(BoardVO board) throws Exception{
		dao.create(board);
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception{
		return dao.read(bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}
	
	
}
