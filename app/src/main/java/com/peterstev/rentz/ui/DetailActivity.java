package com.peterstev.rentz.ui;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.peterstev.rentz.R;

/**
 * Created by Peterstev on 7/5/2016.
 */
public class DetailActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView t = (TextView) findViewById(R.id.main_item_price_tag);
        view = t.getRootView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.detail_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorite:
                Snackbar.make(view, "Added to Favorites", Snackbar.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_text:
                Snackbar.make(view, "Sending SMS", Snackbar.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_share:
                Snackbar.make(view, "Sharing", Snackbar.LENGTH_SHORT)
                        .show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
