package com.weeidl.gogodag.adapter;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.weeidl.gogodag.InformationAboutItem;
import com.weeidl.gogodag.MainActivity;
import com.weeidl.gogodag.R;
import com.weeidl.gogodag.model.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder>{

    private final List places;
    private final Context context;

    public PlacesAdapter(Context context, List<RecentsData> places){
        this.context = context;
        this.places = places;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View view) {
            super(view);
        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.places_layout, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        ImageView image;
        image = viewHolder.itemView.findViewById(R.id.placePic);
        TextView placeName = viewHolder.itemView.findViewById(R.id.placeName);
        placeName.setText(String.valueOf(position));
        image.setImageResource(((RecentsData)places.get(position)).getImageUrls().get(0));
        placeName.setText(((RecentsData)places.get(position)).getPlaceName());
        image.setOnClickListener(v -> {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.activity, new Pair<>(image, "frame"));
            Bundle bundle = options.toBundle();
            Intent intent = new Intent(MainActivity.activity, InformationAboutItem.class);
            intent.putIntegerArrayListExtra("image", (ArrayList<Integer>) ((RecentsData)places.get(position)).getImageUrls());
            intent.putExtra("text", placeName.getText());
            intent.putExtra("description", ((RecentsData) places.get(position)).getDescription());
            intent.putExtra("color", R.color.pink);
            MainActivity.activity.startActivity(intent, bundle);
        });
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

}