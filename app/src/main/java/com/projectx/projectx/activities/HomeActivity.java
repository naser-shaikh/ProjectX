package com.projectx.projectx.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.projectx.projectx.R;
import com.projectx.projectx.adapters.HomeGroupsListAdapter;
import com.projectx.projectx.models.GroupsInfoModel;
import com.projectx.projectx.models.Resources;
import com.projectx.projectx.parser.XMLParser;
import com.projectx.projectx.utils.GroupInfoFinder;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/*
    App Name: FairShare, FlatMates
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

    @Bean
    HomeGroupsListAdapter adapter;

    @Bean
    GroupInfoFinder finder;

    @AfterViews
    void setTitle(){
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Project X Home Screen");
    }

    @Click(R.id.btnHomeCreateGroup)
    void createNewGroup(){
        startNewActivity(CreateGroupActivity_.class);
    }

    void startNewActivity(Class cls){
        startActivity(new Intent(this, cls));
    }

    @AfterViews
    void startAlgo(){
        ArrayList<GroupsInfoModel> list = finder.dummyModels();

        if (list.size() == 0){
            mLstHomeGroups.setVisibility(View.GONE);
            mTxtEmptyListMsg.setVisibility(View.VISIBLE);
        }else{
            mLstHomeGroups.setVisibility(View.VISIBLE);
            mTxtEmptyListMsg.setVisibility(View.GONE);
            mLstHomeGroups.setAdapter(adapter);
        }
        //btnCreateNewGroup.setBackground(colorChanger("#00ff00"));
        //parseData();
    }

    @ItemClick(R.id.lstHomeGroupsList)
    void listItemClicked(GroupsInfoModel model){
        startNewActivity(GroupHomeScreen_.class);
    }

}
