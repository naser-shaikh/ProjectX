package com.projectx.projectx.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.projectx.projectx.models.ExpenseInfoModel;
import com.projectx.projectx.utils.ExpenseInfoFinder;
import com.projectx.projectx.views.ExpenseInfoView;
import com.projectx.projectx.views.ExpenseInfoView_;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import java.util.ArrayList;

/**
 * Created by nshaikh on 2/9/2016.
 */
@EBean
public class ExpenseListAdapter extends BaseAdapter {

    ArrayList<ExpenseInfoModel> models;

    @Bean
    ExpenseInfoFinder finder;

    @Override
    public int getCount() {
        return models.size();
    }

    @AfterInject
    void initAdapter(){
        models = finder.getModels();
    }

    @Override
    public ExpenseInfoModel getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ExpenseInfoView expenseInfoView;

        if (convertView == null){
            expenseInfoView = ExpenseInfoView_.build(parent.getContext());
        }else{
            expenseInfoView = (ExpenseInfoView) convertView;
        }

        expenseInfoView.bind(getItem(position));

        return expenseInfoView;
    }
}
