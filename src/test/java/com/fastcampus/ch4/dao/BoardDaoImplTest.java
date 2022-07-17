package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.BoardDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

public class BoardDaoImplTest {
    @Autowired
    BoardDao boardDao;

    @Test
    public void select() throws Exception {
        assertTrue(boardDao != null);
        System.out.println("boardDao = " + boardDao);
        BoardDto boardDto = boardDao.select(1);
        System.out.println("boardDto = " + boardDto);
        assertTrue(boardDto.getBno().equals(1));
    }
}