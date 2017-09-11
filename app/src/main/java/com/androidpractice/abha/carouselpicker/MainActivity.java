package com.androidpractice.abha.carouselpicker;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class MainActivity extends AppCompatActivity {

    CarouselPicker carouselPicker1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselPicker1 = (CarouselPicker) findViewById(R.id.carouselPicker1);

        // Carousel with all images
        List<CarouselPicker.PickerItem> itemImages = new ArrayList<>();
        itemImages.add(new CarouselPicker.DrawableItem(R.drawable.ic_female));
        itemImages.add(new CarouselPicker.DrawableItem(R.drawable.ic_female));
        itemImages.add(new CarouselPicker.DrawableItem(R.drawable.ic_female));
        itemImages.add(new CarouselPicker.DrawableItem(R.drawable.ic_female));

        CarouselPicker.CarouselViewAdapter viewAdapter = new CarouselPicker.CarouselViewAdapter(this, itemImages, 0);
        carouselPicker1.setAdapter(viewAdapter);

        carouselPicker1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(getApplicationContext(), "Position selected: " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
