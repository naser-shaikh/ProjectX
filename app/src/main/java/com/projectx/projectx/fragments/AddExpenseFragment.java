package com.projectx.projectx.fragments;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.widget.TextView;

import com.projectx.projectx.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Naser Shaikh on 2/3/2016.
 */
@EFragment(R.layout.fragment_add_expense)
public class AddExpenseFragment extends Fragment {

    private String[] users = {"Alpha", "Beta", "Gama", "Alpha"};

    private int selectedUser = 0;

    @ViewById(R.id.txtAddExpenseUserSelection)
    TextView mTxtSelectionText;

    @Click(R.id.txtAddExpenseUserSelection)
    void showUserSelectionDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Who's Paying");
        builder.setSingleChoiceItems(users, selectedUser, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                selectedUser = which;
                setSelectedUser();
            }
        });
        builder.show();
    }

    @AfterViews
    void setSelectedUser(){
        mTxtSelectionText.setText(users[selectedUser]);
    }

}
