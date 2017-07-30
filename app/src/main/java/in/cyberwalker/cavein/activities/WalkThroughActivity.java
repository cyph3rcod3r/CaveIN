package in.cyberwalker.cavein.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import in.cyberwalker.cavein.R;
import in.cyberwalker.cavein.ui.LoginWalkThroughFragment;


/**
 * Created by Cyph3r on 25/02/17.
 */

public class WalkThroughActivity extends BaseActivity {

    private static final int NUM_PAGES = 3;

    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    @Override
    public void initContentView() {
        setContentView(R.layout.activity_walkthrough);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new LoginPageAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }

    private class LoginPageAdapter extends FragmentStatePagerAdapter {
        public LoginPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            String contentText = null, headerText = null;
            int id = 0;
            switch (position) {
                case 0:
                    headerText = "Discover interesting things";
                    contentText = "Let us help you to find exciting things you will love, no matter where you go.";
                    break;

                case 1:
                    headerText = "Connect People";
                    contentText = "Our mission is to connect people with the places in which they spend their time.";
                    break;

                case 2:
                    headerText = "Ready to explore ?";
                    contentText = "Our app offers comprehensive guides to events and places.";
                    break;
            }

            return LoginWalkThroughFragment.newInstance(headerText, contentText, id);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

    public void onClick(View v) {
        int id = v.getId();

    }

    @Override
    public String getToolbarTitle() {
        return getString(R.string.app_name);
    }

}
