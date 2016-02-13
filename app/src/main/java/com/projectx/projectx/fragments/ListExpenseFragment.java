package com.projectx.projectx.fragments;

import android.support.v4.app.Fragment;
import android.widget.ListView;

import com.projectx.projectx.R;
import com.projectx.projectx.adapters.ExpenseListAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by nshaikh on 2/3/2016.
 */

@EFragment(R.layout.fragment_list_expense)
public class ListExpenseFragment extends Fragment {

    @ViewById
    ListView lstListExpense;

    @Bean
    ExpenseListAdapter adapter;

    @AfterViews
    void popAdapter(){
        lstListExpense.setAdapter(adapter);
    }

}
