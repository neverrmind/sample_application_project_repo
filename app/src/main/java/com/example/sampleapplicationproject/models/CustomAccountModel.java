package com.example.sampleapplicationproject.models;

import java.io.Serializable;

public class CustomAccountModel implements Serializable {

    String accountName;
    String departmentName;
    int accountNumber;
    double balance;

    public CustomAccountModel(String accountNameModel, String departmentNameModel, int accountNumberModel, double balanceModel) {
        this.accountName = accountNameModel;
        this.departmentName = departmentNameModel;
        this.accountNumber = accountNumberModel;
        this.balance = balanceModel;
    }

    public CustomAccountModel() {
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}