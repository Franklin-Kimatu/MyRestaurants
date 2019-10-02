package com.moringa.myrestaurants;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyRestaurantsArrayAdapter extends ArrayAdapter {
    private Context mContent;
    private String[] mRestaurants;
    private String[] mCuisines;

    public MyRestaurantsArrayAdapter(Context mContent,int resource,String[] mRestaurants,String[] mCuisines){
        super(mContent,resource);
        this.mContent =mContent;
        this.mCuisines =mCuisines;
        this.mRestaurants =mRestaurants;
    }
}
