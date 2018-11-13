package com.example.velsol.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class ViewFlipperExample extends AppCompatActivity
{
    ViewFlipper flips;
    int i;
    int img[]={R.drawable.food,R.drawable.fish,R.drawable.french_fries,R.drawable.pizza};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper_example);
        flips=(ViewFlipper)findViewById(R.id.flips);

        for (i=0;i<img.length;i++)
        {
            flipperImage(img[i]);
        }


    }
    public void flipperImage(final int image)
    {
        ImageView im=new ImageView(this);
        im.setBackgroundResource(image);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                switch (image)
                {
                    case R.drawable.food :
                    {
                        Toast.makeText(ViewFlipperExample.this, "food", Toast.LENGTH_SHORT).show();
                    }
                    default:
                        Toast.makeText(ViewFlipperExample.this, ""+image, Toast.LENGTH_SHORT).show();
                }
            }
        });


        flips.addView(im);
        flips.setFlipInterval(4000);
        flips.setAutoStart(true);
//        flips.setInAnimation(this,android.R.anim.slide_out_right);
//        flips.setOutAnimation(this,android.R.anim.slide_in_left);
    }
}
