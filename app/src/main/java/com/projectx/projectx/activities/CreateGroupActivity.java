package com.projectx.projectx.activities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.projectx.projectx.R;
import com.projectx.projectx.fragments.dialogs.CreateNewGroupDialogFragment_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Naser Shaikh on 2/5/2016.
 * Creating new group *
 */
@EActivity(R.layout.activity_create_group)
public class CreateGroupActivity extends AppCompatActivity {

    @ViewById
    Toolbar toolbar;

    @ViewById(R.id.imgCreateGroupCreate)
    ImageView mImgCreate;

    @ViewById(R.id.imgCreateGroupJoin)
    ImageView mImgJoin;

    @AfterViews
    void postOnCreate() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Create Group");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Drawable drawable = getResources().getDrawable(R.drawable.circular_drawable);
        drawable.setColorFilter(getResources().getColor(R.color.colorPrimaryDark), PorterDuff.Mode.SRC_ATOP);

        mImgCreate.setBackground(drawable);
        mImgJoin.setBackground(drawable);
    }

    @Click(R.id.imgCreateGroupJoin)
    void onJoinClicked() {

    }

    @Click(R.id.imgCreateGroupCreate)
    void onCreateClick(){
        new CreateNewGroupDialogFragment_.FragmentBuilder_().build().show(getSupportFragmentManager(), "CreateNewGroup");
    }


}
