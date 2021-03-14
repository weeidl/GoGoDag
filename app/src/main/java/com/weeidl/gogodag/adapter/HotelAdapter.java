package com.weeidl.gogodag.adapter;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.weeidl.gogodag.InformationAboutItem;
import com.weeidl.gogodag.MainActivity;
import com.weeidl.gogodag.R;
import com.weeidl.gogodag.model.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    private Context context;
    private List recentsData;

    public HotelAdapter(Context context, List recentsData){
        this.context = context;
        this.recentsData = recentsData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_layout, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ImageView hotelPic;
        ImageView[] stars = new ImageView[5];
        TextView hotelName;
        RecentsData hotelData;

        hotelPic = holder.itemView.findViewById(R.id.hotelPic);
        hotelName = holder.itemView.findViewById(R.id.hotelName);
        stars[0] = holder.itemView.findViewById(R.id.star1);
        stars[1] = holder.itemView.findViewById(R.id.star2);
        stars[2] = holder.itemView.findViewById(R.id.star3);
        stars[3] = holder.itemView.findViewById(R.id.star4);
        stars[4] = holder.itemView.findViewById(R.id.star5);
        hotelData = (RecentsData) recentsData.get(position);

        hotelPic.setImageResource(hotelData.getImageUrls().get(0));
        hotelName.setText(hotelData.getPlaceName());

        for (int i = hotelData.getStars(); i>0; i--){
            stars[i - 1].setImageResource(R.drawable.ic_baseline_star_24);
        }

        hotelPic.setOnClickListener(v -> {
            ActivityOptions options;
            Bundle bundle;
            Intent intent;

            options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.activity, new Pair<>(hotelPic, "frame"));
            bundle = options.toBundle();
            intent = new Intent(MainActivity.activity, InformationAboutItem.class);

            intent.putIntegerArrayListExtra("image", (ArrayList<Integer>) hotelData.getImageUrls());
            intent.putExtra("text", hotelData.getPlaceName());
            intent.putExtra("description", hotelData.getDescription());
            intent.putExtra("color", R.color.blue);

            MainActivity.activity.startActivity(intent, bundle);
        });

    }

    @Override
    public int getItemCount() {
        return recentsData.size();
    }
}
