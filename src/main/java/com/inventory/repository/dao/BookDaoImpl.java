package com.inventory.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inventory.repository.vo.BookVo;

@Repository
public class BookDaoImpl implements BookDao {

    private final SqlSession sqlSession;

    @Autowired
    public BookDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<BookVo> selectAll() {
        return sqlSession.selectList("selectAll");
    }

    @Override
    public List<BookVo> selectListByKeyword(String keyword) {
        return sqlSession.selectList("selectListByKeyword", keyword);
    }

    @Override
    public BookVo selectOne(Integer id) {
        return sqlSession.selectOne("selectOne", id);
    }

    @Override
    public int insert(BookVo bookVo) {
        return sqlSession.insert("insert", bookVo);
    }

    @Override
    public int delete(BookVo bookVo) {
        return sqlSession.delete("delete", bookVo);
    }

    @Override
    public BookVo findById(Long id) {
        return sqlSession.selectOne("selectOne", id.intValue());
    }
}
