package com.example.velsol.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class ViewFlipperExample extends AppCompatActivity
{
    ViewFlipper flips;
    int img[]={R.drawable.food,R.drawable.fish,R.drawable.french_fries,R.drawable.pizza};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper_example);
        flips=(ViewFlipper)findViewById(R.id.flips);

        for (int image : img)
        {
            flipperImage(image);
        }
    }
    public void flipperImage(int image)
    {
        ImageView im=new ImageView(this);
        im.setBackgroundResource(image);
        flips.addView(im);
        flips.setFlipInterval(4000);
        flips.setAutoStart(true);
        flips.setInAnimation(this,android.R.anim.slide_out_right);
        flips.setOutAnimation(this,android.R.anim.slide_in_left);
    }
}
