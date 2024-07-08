package com.inventory.repository.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inventory.repository.vo.BranchInventoryVo;

@Repository
public class BranchInventoryDaoImpl implements BranchInventoryDao {

    private final SqlSession sqlSession;

    @Autowired
    public BranchInventoryDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public BranchInventoryVo findById(Long id) {
        return sqlSession.selectOne("branchInventory.selectById", id);
    }

    @Override
    public void save(BranchInventoryVo branchInventory) {
        sqlSession.insert("branchInventory.insert", branchInventory);
    }

    @Override
    public void update(BranchInventoryVo branchInventory) {
        sqlSession.update("branchInventory.update", branchInventory);
    }

    @Override
    public void delete(Long id) {
        sqlSession.delete("branchInventory.delete", id);
    }

    @Override
    public List<BranchInventoryVo> findAll() {
        return sqlSession.selectList("branchInventory.selectAll");
    }

    // Additional methods as needed
}