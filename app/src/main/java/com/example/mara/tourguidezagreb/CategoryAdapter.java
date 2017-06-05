package com.example.mara.tourguidezagreb;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mara on 4.6.2017..
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SeeFragment();
        } else if (position == 1) {
            return new EatFragment();
        } else if (position == 2) {
            return new SleepFragment();
        } else {
            return new VisitFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.see_category);
        } else if (position == 1) {
            return mContext.getString(R.string.eat_category);
        } else if (position == 2) {
            return mContext.getString(R.string.sleep_category);
        } else {
            return mContext.getString(R.string.visit_category);
        }
    }
}


