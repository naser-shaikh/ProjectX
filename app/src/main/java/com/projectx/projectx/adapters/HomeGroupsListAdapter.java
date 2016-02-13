package com.projectx.projectx.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.projectx.projectx.models.GroupsInfoModel;
import com.projectx.projectx.utils.GroupInfoFinder;
import com.projectx.projectx.views.GroupInfoView;
import com.projectx.projectx.views.GroupInfoView_;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nshaikh on 2/5/2016.
 */

@EBean
public class HomeGroupsListAdapter extends BaseAdapter {

    ArrayList<GroupsInfoModel> models;

    @Bean
    GroupInfoFinder infoFinder;

    @AfterInject
    void initAdapter(){
        models = infoFinder.dummyModels();
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public GroupsInfoModel getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GroupInfoView groupInfoView;

        if (convertView == null){
            groupInfoView = GroupInfoView_.build(parent.getContext());
        }else{
            groupInfoView = (GroupInfoView) convertView;
        }

        groupInfoView.bind(getItem(position));

        return groupInfoView;
    }
}
