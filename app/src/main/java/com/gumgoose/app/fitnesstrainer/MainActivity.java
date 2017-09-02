package com.gumgoose.app.fitnesstrainer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mPlaceholderMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_nav_diet:
                    mPlaceholderMessage.setText(R.string.nav_title_diet);
                    return true;
                case R.id.action_nav_today:
                    mPlaceholderMessage.setText(R.string.nav_title_today);
                    return true;
                case R.id.action_nav_train:
                    mPlaceholderMessage.setText(R.string.nav_title_train);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlaceholderMessage = (TextView) findViewById(R.id.placeholder);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        /* This switches the active tab in view to 'Today' */
        navigation.getMenu().getItem(1).setChecked(true);
    }
}