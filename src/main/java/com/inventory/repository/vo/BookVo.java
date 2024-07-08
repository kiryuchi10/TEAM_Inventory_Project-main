package com.inventory.repository.vo;

import java.util.Date;

public class BookVo {
    private Long bookId;
    private String title;
    private String author;
    private Double price;
    private Integer stock;
    private Date createdAt;

    // Constructors, getters, and setters
    public BookVo() {
    }

    public BookVo(Long bookId, String title, String author, Double price, Integer stock, Date createdAt) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.createdAt = createdAt;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}