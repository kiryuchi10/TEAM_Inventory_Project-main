package com.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.repository.dao.BranchInventoryDao;
import com.inventory.repository.vo.BranchInventoryVo;

@Service
@Transactional
public class BranchInventoryServiceImpl implements BranchInventoryService {

    private final BranchInventoryDao branchInventoryDao;

    @Autowired
    public BranchInventoryServiceImpl(BranchInventoryDao branchInventoryDao) {
        this.branchInventoryDao = branchInventoryDao;
    }

    @Override
    public BranchInventoryVo findById(Long id) {
        return branchInventoryDao.findById(id);
    }

    @Override
    public void save(BranchInventoryVo branchInventory) {
        branchInventoryDao.save(branchInventory);
    }

    @Override
    public void update(BranchInventoryVo branchInventory) {
        branchInventoryDao.update(branchInventory);
    }

    @Override
    public void delete(Long id) {
        branchInventoryDao.delete(id);
    }

    @Override
    public List<BranchInventoryVo> findAll() {
        return branchInventoryDao.findAll();
    }

    // Additional methods as needed
}