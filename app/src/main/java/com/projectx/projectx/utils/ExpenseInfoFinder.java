package com.projectx.projectx.utils;

import com.projectx.projectx.models.ExpenseInfoModel;
import com.projectx.projectx.models.GroupsInfoModel;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;

/**
 * Created by nshaikh on 2/9/2016.
 */

@EBean
public class ExpenseInfoFinder {

    public ArrayList<ExpenseInfoModel> getModels(){
        ArrayList<ExpenseInfoModel> list = new ArrayList<>();
        for (int i = 0; i < 10; i++ ){
            ExpenseInfoModel model = new ExpenseInfoModel();
            model.setExpenseName("Dummy Group Name "+i);
            model.setExpenseDetails("Dummy Details " + i);
            list.add(model);
        }
        return list;
    }

}
