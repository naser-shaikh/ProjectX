package com.projectx.projectx.database;

import android.content.Context;

import com.j256.ormlite.dao.Dao;
import com.projectx.projectx.database.models.ExpenseModel;
import com.projectx.projectx.database.models.GroupModel;
import com.projectx.projectx.database.models.UserModel;

import java.sql.SQLException;

/**
 * Created by nshaikh on 2/15/2016.
 */
public class DatabaseManager  {
    private DatabaseHelper helper;
    private static DatabaseManager instance = null;

    private Dao<ExpenseModel,Integer> expenseDao = null;
    private Dao<UserModel, Integer> userDao = null;
    private Dao<GroupModel, Integer> groupDao = null;

    private DatabaseManager(Context context){
        helper = new DatabaseHelper(context);
    }

    public static DatabaseManager getInstance(Context applicationContext){
        if (instance == null){
            synchronized (DatabaseManager.class){
                instance = new DatabaseManager(applicationContext);
            }
        }
        return instance;
    }

    private DatabaseHelper getHelper(){
        return helper;
    }

    public Dao<ExpenseModel, Integer> getExpenseDao() throws SQLException {
        if (expenseDao == null){
            expenseDao = getHelper().getDao(ExpenseModel.class);
        }

        return  expenseDao;
    }

    public Dao<UserModel,Integer> getUserDao() throws SQLException {
        if (userDao == null){
            userDao = getHelper().getDao(UserModel.class);
        }

        return userDao;
    }

    public Dao<GroupModel, Integer> getGroupDao() throws SQLException {
        if (groupDao == null){
            groupDao = getHelper().getDao(GroupModel.class);
        }

        return groupDao;
    }

}
