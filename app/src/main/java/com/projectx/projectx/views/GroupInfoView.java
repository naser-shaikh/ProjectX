package com.projectx.projectx.views;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.projectx.projectx.R;
import com.projectx.projectx.models.GroupsInfoModel;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by nshaikh on 2/5/2016.
 */
@EViewGroup(R.layout.item_home_group_list)
public class GroupInfoView extends LinearLayout {

    @ViewById(R.id.txtItmHomeGroupName)
    TextView txtGroupName;

    @ViewById(R.id.txtItmHomeGroupDetails)
    TextView txtGroupDetails;

    @ViewById(R.id.imgItmHomeGroup)
    ImageView imgGroupImage;

    public GroupInfoView(Context context) {
        super(context);
    }

    public void bind(GroupsInfoModel model){
        txtGroupName.setText(model.getGroupName());
        txtGroupDetails.setText(model.getGroupDetails());
    }

}
