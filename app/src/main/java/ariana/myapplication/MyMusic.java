package ariana.myapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import ariana.myapplication.adapters.ViewPagerAdapter;
import ariana.myapplication.iosched.SlidingTabLayout;


public class MyMusic extends ActionBarActivity {

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    SlidingTabLayout slidingTabLayout;
    CharSequence Titles[]={"Destacados","Amigos", "Perfil"};
    int Numboftabs = 3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        /* Tabs en API 21
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);*/
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.my_awesome_toolbar);
        toolbar.setTitle("My Music");
        toolbar.setSubtitle("");
        setSupportActionBar(toolbar);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, Numboftabs);
        viewPager = (ViewPager) findViewById(R.id.my_awesome_pager);
        viewPager.setAdapter(viewPagerAdapter);

        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.my_awesome_tabs);
        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        slidingTabLayout.setViewPager(viewPager);
    }

}
