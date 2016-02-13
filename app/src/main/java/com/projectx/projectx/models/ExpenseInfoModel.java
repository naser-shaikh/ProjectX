package com.projectx.projectx.models;

/**
 * Created by nshaikh on 2/9/2016.
 */
public class ExpenseInfoModel {
    private String expenseName;
    private String expenseAmount;
    private String expensePaidBy;
    private String expenseDetails;
    private String expenseDate;
    private boolean isSync;

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getExpensePaidBy() {
        return expensePaidBy;
    }

    public void setExpensePaidBy(String expensePaidBy) {
        this.expensePaidBy = expensePaidBy;
    }

    public String getExpenseDetails() {
        return expenseDetails;
    }

    public void setExpenseDetails(String expenseDetails) {
        this.expenseDetails = expenseDetails;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public boolean isSync() {
        return isSync;
    }

    public void setIsSync(boolean isSync) {
        this.isSync = isSync;
    }
}
