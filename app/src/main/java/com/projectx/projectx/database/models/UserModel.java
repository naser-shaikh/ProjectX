package com.projectx.projectx.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Naser Shaikh on 2/15/2016.
 */
@DatabaseTable(tableName = "user_table")
public class UserModel {

    @DatabaseField(generatedId = true, unique = true)
    private int userID;

    @DatabaseField(throwIfNull = true)
    private int groupID;

    @DatabaseField(throwIfNull = true)
    private String userName;

    @DatabaseField
    private String userPic;

    @DatabaseField
    private String userStatusMassage;

    public UserModel() { }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getUserStatusMassage() {
        return userStatusMassage;
    }

    public void setUserStatusMassage(String userStatusMassage) {
        this.userStatusMassage = userStatusMassage;
    }
}
