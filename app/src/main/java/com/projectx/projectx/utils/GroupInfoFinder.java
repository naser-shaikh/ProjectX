package com.projectx.projectx.utils;

import com.projectx.projectx.models.GroupsInfoModel;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import java.util.ArrayList;

/**
 * Created by nshaikh on 2/5/2016.
 */
@EBean
public class GroupInfoFinder {

    public ArrayList<GroupsInfoModel> dummyModels(){
        ArrayList<GroupsInfoModel> list = new ArrayList<>();
        for (int i = 0; i < 10; i++ ){
            GroupsInfoModel model = new GroupsInfoModel();
            model.setGroupName("Dummy Group Name "+i);
            model.setGroupDetails("Dummy Details " + i);
            list.add(model);
        }
        return list;
    }

}
