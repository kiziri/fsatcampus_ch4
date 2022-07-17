package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired SqlSession session;
    private static String namespace = "com.fastcampus.ch4.dao.BoardMapper.";

    public BoardDto select(Integer bno) throws Exception {
        return session.selectOne(namespace + "select", bno);
    } // T selectOne(String statement, Object parameter)

    @Override
    public int delete(Integer bno, String writer) throws Exception {
        return 0;
    }

    @Override
    public int insert(BoardDto dto) throws Exception {
        return 0;
    }

    @Override
    public int update(BoardDto dto) throws Exception {
        return 0;
    }

    @Override
    public int increaseViewCnt(Integer bno) throws Exception {
        return 0;
    }

    @Override
    public List<BoardDto> selectPage(Map map) throws Exception {
        return null;
    }

    @Override
    public List<BoardDto> selectAll() throws Exception {
        return null;
    }

    @Override
    public int deleteAll() throws Exception {
        return 0;
    }

    @Override
    public int count() throws Exception {
        return 0;
    }
}
