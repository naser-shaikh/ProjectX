package com.projectx.projectx.fragments.dialogs;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import com.projectx.projectx.R;
import com.projectx.projectx.database.database_managers.GroupManager;
import com.projectx.projectx.database.models.GroupModel;
import com.projectx.projectx.utils.Ui;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;


/**
 * Created by Naser Shaikh on 2/15/2016.
 */
@EFragment
public class CreateNewGroupDialogFragment extends DialogFragment {

    @ViewById(R.id.edtDialogCreateNewGroupName)
    EditText mEdtGroupName;

    @ViewById(R.id.edtDialogCreateNewGroupDetails)
    EditText mEdtGroupDetails;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_create_new_group, container, false);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    @Click(R.id.btnDialogCreateNewGroupCancel)
    void onCancelClick(){
        getDialog().dismiss();
    }

    @Click(R.id.btnDialogCreateNewGroupOK)
    void onOKClick(){
        if (!validation()){
            Ui.snackBar(getActivity(), "Group Name and details can not be empty" );
            return;
        }

        GroupModel groupModel = new GroupModel();
        groupModel.setGroupName(mEdtGroupName.getText().toString());
        groupModel.setGroupDetails(mEdtGroupDetails.getText().toString());
        groupModel.setGroupDate(System.currentTimeMillis());

        GroupManager.getInstance (getActivity().getApplicationContext()).createNewGroup(groupModel);
    }

    @Override
    public void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    private boolean validation(){
        if (mEdtGroupName.getText().toString().trim().length() == 0){
            return false;
        }

        if (mEdtGroupDetails.getText().toString().trim().length() == 0){
            return false;
        }
        return  true;
    }
}
