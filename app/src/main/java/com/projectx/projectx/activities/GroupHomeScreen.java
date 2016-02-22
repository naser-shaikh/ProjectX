package com.projectx.projectx.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.projectx.projectx.R;
import com.projectx.projectx.fragments.AddExpenseFragment_;
import com.projectx.projectx.fragments.HistoryExpenseFragment_;
import com.projectx.projectx.fragments.ListExpenseFragment_;
import com.projectx.projectx.fragments.SyncFragment_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naser Shaikh on 2/2/2016.
 */
@EActivity(R.layout.activity_group_home)
public class GroupHomeScreen extends AppCompatActivity {

    @Override
    public void setTheme(int resid) {
        super.setTheme(resid);
    }

    @ViewById(R.id.toolbar)
    Toolbar toolbar;

    @ViewById(R.id.tabs)
    TabLayout tabLayout;

    @ViewById(R.id.viewpager)
    ViewPager viewPager;

    @AfterViews
    void setToolbarTitle(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("X GroupModel Screen");
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AddExpenseFragment_(), "Add");
        adapter.addFragment(new ListExpenseFragment_(), "List");
        adapter.addFragment(new HistoryExpenseFragment_(), "History");
        adapter.addFragment(new SyncFragment_(), "Sync");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
