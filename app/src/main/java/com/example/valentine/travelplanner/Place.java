package com.example.valentine.travelplanner;

import android.content.Context;

/**
 * Created by valentine on 12/10/15.
 */

public class Place {

    public String name;
    public String imageName;
    public boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}

