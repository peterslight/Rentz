package com.peterstev.rentz.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.peterstev.rentz.R;
import com.peterstev.rentz.pojo.Pojo;

import java.util.ArrayList;

/**
 * Created by Peterstev on 7/5/2016.
 */
public class MainActivityListAdapter extends ArrayAdapter<Pojo> {
    private Context context;
    private int resource;
    private ArrayList stringArray;

    public MainActivityListAdapter(Context context, int resource, ArrayList stringArray) {
        super(context,R.layout.activity_card_content, resource);
        this.context = context;
        this.resource = resource;
        this.stringArray = stringArray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pojo pojo = getItem(position);
        View view = convertView;
        TextView item_description, item_price, item_date_post, item_name;

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_card_content, parent);
        }
        item_name = (TextView) view.findViewById(R.id.main_item_name);
        item_date_post = (TextView) view.findViewById(R.id.main_item_date_post);
        item_description = (TextView) view.findViewById(R.id.main_item_location);
        item_price = (TextView) view.findViewById(R.id.main_item_price_tag);

        item_name.setText(pojo.getName());
        item_date_post.setText(pojo.getDate());
        item_description.setText(pojo.getLocation());
        item_price.setText(pojo.getPrice());


//        item_name.setText("New Land");
//        item_date_post.setText("27/5/2016");
//        item_description.setText("affordable land for sale");
//        item_price.setText("N" + 5000000);

        return view;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
