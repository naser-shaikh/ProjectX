package com.projectx.projectx.database.database_managers;

import android.content.Context;

import com.projectx.projectx.database.DatabaseManager;
import com.projectx.projectx.database.models.GroupModel;
import com.projectx.projectx.log.Log;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Naser Shaikh on 2/15/2016.
 */
public class GroupManager {
    private DatabaseManager databaseManager;

    private static GroupManager sInstance;

    private GroupManager(Context applicationContext){
        databaseManager = DatabaseManager.getInstance(applicationContext);
    }

    public static GroupManager getInstance(Context applicationContext){
        if (sInstance == null){
            synchronized (GroupManager.class){
                sInstance = new GroupManager(applicationContext);
            }
        }

        return sInstance;
    }

    public void createNewGroup(GroupModel group){
        try {
            databaseManager.getGroupDao().create(group);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<GroupModel> getAllGroupsList(){
        try {
            return (ArrayList<GroupModel>) databaseManager.getGroupDao().queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<GroupModel>();
    }
}
