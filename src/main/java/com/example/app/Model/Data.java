package com.example.app.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "data")
public class Data {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Column(name = "productID")
    private String productID;

    @Column(name = "productName")
    private String productName;

    private String amount;

    @Column(name = "customerName")
    private String customerName;

    private int status;
     
    @Column(name = "transactionDate")
    private LocalDateTime transactionDate;

    @Column(name = "createBy")
    private String createBy;
    
    @Column(name = "createOn")
    private LocalDateTime createOn;

    public Data() {
    }

    public Data(int id, String productID, String productName, String amount, String customerName, int status,
            LocalDateTime transactionDate, String createBy, LocalDateTime createOn) {
        this.id = id;
        this.productID = productID;
        this.productName = productName;
        this.amount = amount;
        this.customerName = customerName;
        this.status = status;
        this.transactionDate = transactionDate;
        this.createBy = createBy;
        this.createOn = createOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateOn() {
        return createOn;
    }

    public void setCreateOn(LocalDateTime createOn) {
        this.createOn = createOn;
    }

    


}
