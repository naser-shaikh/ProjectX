package com.projectx.projectx.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.projectx.projectx.R;
import com.projectx.projectx.database.models.GroupModel;
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

import uk.co.ribot.easyadapter.ItemViewHolder;
import uk.co.ribot.easyadapter.PositionInfo;
import uk.co.ribot.easyadapter.annotations.LayoutId;
import uk.co.ribot.easyadapter.annotations.ViewId;

/**
 * Created by Naser Shaikh on 2/5/2016.
 */

@LayoutId(R.layout.item_home_group_list)
public class HomeGroupHolder extends ItemViewHolder<GroupModel> {



    @ViewId(R.id.txtItmHomeGroupName)
    TextView mTxtGroupName;

    @ViewId(R.id.txtItmHomeGroupDetails)
    TextView mTxtGroupDetails;


    public HomeGroupHolder(View view) {
        super(view);
    }

    @Override
    public void onSetValues(GroupModel item, PositionInfo positionInfo) {
        mTxtGroupName.setText(item.getGroupName());
        mTxtGroupDetails.setText(item.getGroupDetails());
    }

}
