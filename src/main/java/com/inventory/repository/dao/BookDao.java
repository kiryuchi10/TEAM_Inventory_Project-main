package com.inventory.repository.dao;

import com.inventory.repository.vo.BookVo;

import java.util.List;

public interface BookDao {
    List<BookVo> selectAll();
    List<BookVo> selectListByKeyword(String keyword);
    BookVo selectOne(Integer id);
    int insert(BookVo bookVo);
    int delete(BookVo bookVo);
    BookVo findById(Long id);
}
