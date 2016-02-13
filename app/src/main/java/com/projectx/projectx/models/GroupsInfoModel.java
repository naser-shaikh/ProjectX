package com.projectx.projectx.models;

/**
 * Created by nshaikh on 2/5/2016.
 */
public class GroupsInfoModel {
    private String groupName;
    private String groupDetails;
    private String groupImage;
    private int groupTotalMembers;
    private String groupDateCreate;
    private int groupTotalSync;

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

    public String getGroupImage() {
        return groupImage;
    }

    public void setGroupImage(String groupImage) {
        this.groupImage = groupImage;
    }

    public int getGroupTotalMembers() {
        return groupTotalMembers;
    }

    public void setGroupTotalMembers(int groupTotalMembers) {
        this.groupTotalMembers = groupTotalMembers;
    }

    public String getGroupDateCreate() {
        return groupDateCreate;
    }

    public void setGroupDateCreate(String groupDateCreate) {
        this.groupDateCreate = groupDateCreate;
    }

    public int getGroupTotalSync() {
        return groupTotalSync;
    }

    public void setGroupTotalSync(int groupTotalSync) {
        this.groupTotalSync = groupTotalSync;
    }
}
