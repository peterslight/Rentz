package com.peterstev.rentz.pojo;

import java.util.ArrayList;

/**
 * Created by Peterstev on 7/5/2016.
 */
public class Pojo extends ArrayList {

    private String name = "Seller Name";
    private String date = "Post Date";
    private String location = "Post Location";
    private String price = "Post Price";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
