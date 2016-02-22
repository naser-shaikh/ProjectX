package com.projectx.projectx.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;

/**
 * Created by Naser Shaikh on 2/15/2016.
 */
@DatabaseTable(tableName = "expense_table")
public class ExpenseModel {

    public static final String EXPENSE_USER_ID = "expenseUserID";
    public static final String EXPENSE_GROUP_ID = "expenseGroupID";

    @DatabaseField(generatedId = true)
    private int expenseID;

    @DatabaseField(throwIfNull = true)
    private String expenseName;

    @DatabaseField(throwIfNull = true)
    private int expenseAmount;

    @DatabaseField
    private String expenseDetails;

    @DatabaseField(throwIfNull = true)
    private Date expenseDate;

    @DatabaseField(throwIfNull = true, columnName = EXPENSE_USER_ID)
    private int expenseUserID;

    @DatabaseField(throwIfNull = true, columnName = EXPENSE_GROUP_ID)
    private int expenseGroupID;

    @DatabaseField
    private int isSync;

    public ExpenseModel() {}

    public int getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(int expenseID) {
        this.expenseID = expenseID;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public int getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(int expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getExpenseDetails() {
        return expenseDetails;
    }

    public void setExpenseDetails(String expenseDetails) {
        this.expenseDetails = expenseDetails;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public int getExpenseUserID() {
        return expenseUserID;
    }

    public void setExpenseUserID(int expenseUserID) {
        this.expenseUserID = expenseUserID;
    }

    public int getExpenseGroupID() {
        return expenseGroupID;
    }

    public void setExpenseGroupID(int expenseGroupID) {
        this.expenseGroupID = expenseGroupID;
    }

    public int getIsSync() {
        return isSync;
    }

    public void setIsSync(int isSync) {
        this.isSync = isSync;
    }
}
