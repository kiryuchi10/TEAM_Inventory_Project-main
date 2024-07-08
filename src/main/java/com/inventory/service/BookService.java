package com.inventory.service;


import java.util.List;

import com.inventory.repository.vo.BookVo;

public interface BookService {
    BookVo findById(Long id);
    List<BookVo> findAll();
    void save(BookVo bookVo);
    void update(BookVo bookVo);
    void delete(Long id);
	List<BookVo> getAllBooks();
}