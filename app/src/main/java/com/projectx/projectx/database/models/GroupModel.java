package com.projectx.projectx.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;

/**
 * Created by Naser Shaikh on 2/15/2016.
 */
@DatabaseTable(tableName = "group_table")
public class GroupModel {

    @DatabaseField(generatedId = true, unique = true)
    private int groupID;

    @DatabaseField(canBeNull = false)
    private String groupName;

    @DatabaseField
    private String groupDetails;

    @DatabaseField
    private String groupPic;

    @DatabaseField(canBeNull = false)
    private long groupDate;

    @DatabaseField
    private int groupSync;

    public GroupModel() { }

    public long getGroupDate() {
        return groupDate;
    }

    public void setGroupDate(long groupDate) {
        this.groupDate = groupDate;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDetails() {
        return groupDetails;
    }

    public void setGroupDetails(String groupDetails) {
        this.groupDetails = groupDetails;
    }

    public String getGroupPic() {
        return groupPic;
    }

    public void setGroupPic(String groupPic) {
        this.groupPic = groupPic;
    }

    public int getGroupSync() {
        return groupSync;
    }

    public void setGroupSync(int groupSync) {
        this.groupSync = groupSync;
    }
}
