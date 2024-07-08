package com.inventory.service;

import java.util.List;

import com.inventory.repository.vo.BranchInventoryVo;

public interface BranchInventoryService {

    BranchInventoryVo findById(Long id);

    void save(BranchInventoryVo branchInventory);

    void update(BranchInventoryVo branchInventory);

    void delete(Long id);

    List<BranchInventoryVo> findAll();

    // Additional methods as needed
}