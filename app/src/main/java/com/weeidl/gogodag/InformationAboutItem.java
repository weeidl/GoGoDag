package com.weeidl.gogodag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weeidl.gogodag.adapter.ImageViewPagerAdapter;
import java.util.ArrayList;
import java.util.Objects;

public class InformationAboutItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_about_item);

        Intent intent;
        Typeface face;
        ViewPager image;
        TextView description;
        Toolbar toolbar;
        CollapsingToolbarLayout ctb;
        ArrayList<Integer> images;
        int color;

        intent = getIntent();
        face = ResourcesCompat.getFont(this, R.font.jura);
        image = findViewById(R.id.placeImg);
        description = findViewById(R.id.opisanie);
        toolbar = findViewById(R.id.toolbar);
        ctb = findViewById(R.id.ctb);
        images = intent.getIntegerArrayListExtra("image");
        color = intent.getIntExtra("color", 0);

        image.setAdapter(new ImageViewPagerAdapter(this, images));
        description.setText(getIntent().getStringExtra("description"));
        ctb.setExpandedTitleColor(Color.WHITE);
        ctb.setCollapsedTitleTypeface(face);
        ctb.setExpandedTitleTypeface(face);
        ctb.setContentScrimColor(getResources().getColor(color));
        toolbar.setTitle(getIntent().getStringExtra("text"));
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}