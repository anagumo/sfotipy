package ariana.myapplication.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ariana.myapplication.fragments.AmigosFragment;
import ariana.myapplication.fragments.DestacadosFragment;
import ariana.myapplication.fragments.ProfileFragment;

/**
 * Created by ariana on 4/03/15.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fragmentManager ,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fragmentManager);

        this.Titles = mTitles;
        this.NumOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                AmigosFragment amigosFragment = new AmigosFragment();
                return amigosFragment;
            case 1:
                DestacadosFragment destacadosFragment = new DestacadosFragment();
                return destacadosFragment;
            default:
                ProfileFragment profileFragment = new ProfileFragment();
                return profileFragment;
        }
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumOfTabs;
    }
}