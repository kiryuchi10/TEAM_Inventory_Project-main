package com.inventory.repository.vo;

public class BranchInventoryVo {
    
    private Long id;
    private BranchInventoryVo branchInventoryVo;
    private BookVo book;
    private Integer inventory;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BranchInventoryVo getBranch() {
        return branchInventoryVo;
    }

    public void setBranch(BranchInventoryVo branchInventoryVo) {
        this.branchInventoryVo = branchInventoryVo;
    }

    public BookVo getBook() {
        return book;
    }

    public void setBook(BookVo book) {
        this.book = book;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
}