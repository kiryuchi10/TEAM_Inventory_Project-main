package com.inventory.repository.dao;

import java.util.List;

import com.inventory.repository.vo.BranchInventoryVo;

public interface BranchInventoryDao {

    BranchInventoryVo findById(Long id);

    void save(BranchInventoryVo branchInventory);

    void update(BranchInventoryVo branchInventory);

    void delete(Long id);

    List<BranchInventoryVo> findAll();

    // Additional methods as needed
}