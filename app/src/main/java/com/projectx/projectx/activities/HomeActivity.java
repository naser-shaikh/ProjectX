package com.projectx.projectx.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.projectx.projectx.R;
import com.projectx.projectx.adapters.HomeGroupHolder;
import com.projectx.projectx.database.database_managers.GroupManager;
import com.projectx.projectx.database.models.GroupModel;
import com.projectx.projectx.utils.Ui;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;

import uk.co.ribot.easyadapter.EasyAdapter;

/*
    App Name: FairShare, FlatMates
    Home Activity which shows the options to create a new group or view existing group
 */

@EActivity(R.layout.activity_home)
public class HomeActivity extends AppCompatActivity {

    @ViewById(R.id.toolbar)
    Toolbar mToolbar;

    @ViewById(R.id.btnHomeCreateGroup)
    Button mBtnCreateNewGroup;

    @ViewById(R.id.lstHomeGroupsList)
    ListView mLstHomeGroups;

    @ViewById(R.id.txtHomeEmptyGroupList)
    TextView mTxtEmptyListMsg;

    /**
     * After onCreate we are setting title name
     */
    @AfterViews
    void setTitle() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Project X Home Screen");
    }

    /**
     * On click of create group, starting create group activity which
     * is responsible for creating new group
     */
    @Click(R.id.btnHomeCreateGroup)
    void createNewGroup() {
        Ui.startActivity(this, CreateGroupActivity_.class);
    }

    /**
     * Here we are getting the list of groups, either user created or he is in one of it.
     * if the list is empty we are showing the empty list massage.
     */
    @AfterViews
    void showGroupList() {
        ArrayList<GroupModel> list = new GroupManager(getApplicationContext()).getAllGroupsList();

        if (list.size() == 0) {
            mLstHomeGroups.setVisibility(View.GONE);
            mTxtEmptyListMsg.setVisibility(View.VISIBLE);
        } else {
            mLstHomeGroups.setVisibility(View.VISIBLE);
            mTxtEmptyListMsg.setVisibility(View.GONE);
            mLstHomeGroups.setAdapter(new EasyAdapter<>(this, HomeGroupHolder.class, list));
        }

    }

    /**
     * OnItemClick listener listen for item click event on the list view
     *
     * @param model
     */
    @ItemClick(R.id.lstHomeGroupsList)
    void listItemClicked(GroupModel model) {
        Ui.startActivity(this, GroupHomeScreen_.class);
    }

}
