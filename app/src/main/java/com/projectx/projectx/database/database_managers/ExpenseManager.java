package com.projectx.projectx.database.database_managers;

import android.content.Context;

import com.projectx.projectx.database.DatabaseManager;
import com.projectx.projectx.database.models.ExpenseModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naser Shaikh on 2/15/2016.
 */
public class ExpenseManager {
    private DatabaseManager databaseManager;

    public ExpenseManager(Context applicationContext) {
        databaseManager = DatabaseManager.getInstance(applicationContext);
    }

    public void addExpense(ExpenseModel expenseModel){
        try {
            databaseManager.getExpenseDao().create(expenseModel);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ExpenseModel> getExpenseList(int userID, int groupID){
        try {
            return databaseManager.getExpenseDao().query(databaseManager.getExpenseDao().queryBuilder().where().eq(ExpenseModel.EXPENSE_USER_ID, userID).and().eq(ExpenseModel.EXPENSE_GROUP_ID, groupID).prepare());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<ExpenseModel>();
    }

}
