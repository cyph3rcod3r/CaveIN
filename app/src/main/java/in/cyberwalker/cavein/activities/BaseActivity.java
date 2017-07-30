package in.cyberwalker.cavein.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import in.cyberwalker.cavein.R;


/**
 * Created by Cyph3r on 18/02/17.
 */

public abstract class BaseActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContentView();
        setupToolbar();
    }

    public void setupToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            setTitle(getToolbarTitle());
        }
    }

    public abstract String getToolbarTitle();

    public abstract void initContentView();
}
