package com.projectx.projectx.database.database_managers;

import android.content.Context;

import com.projectx.projectx.database.DatabaseManager;
import com.projectx.projectx.database.models.UserModel;

import java.sql.SQLException;

/**
 * Created by nshaikh on 2/15/2016.
 */
public class UserManager {
    private DatabaseManager databaseManager;

    public UserManager(Context applicationContext) {
        databaseManager = DatabaseManager.getInstance(applicationContext);
    }

    public void crateNewUser(UserModel model){
        try {
            databaseManager.getUserDao().create(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
