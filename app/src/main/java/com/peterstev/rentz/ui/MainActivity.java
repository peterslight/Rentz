package com.peterstev.rentz.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.peterstev.rentz.R;
import com.peterstev.rentz.adapters.MainActivityListAdapter;
import com.peterstev.rentz.pojo.Pojo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MainActivityListAdapter mainActivityListAdapter;
    private ListView listView;
    Pojo pojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

//        String [] fill = new String [4];
//        fill[0] = "Name";
//        fill[1] = "Price";
//        fill[2] = "Des";
//        fill[3] = "date";

//        listView = (ListView) findViewById(R.id.list_item);
//        mainActivityListAdapter = new MainActivityListAdapter(this, R.layout
//                .activity_card_content, data);
//        listView.setAdapter(mainActivityListAdapter);
    }
}
