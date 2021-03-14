package com.weeidl.gogodag;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jem.fliptabs.FlipTab;
import com.weeidl.gogodag.adapter.ViewPagerAdapter;
import com.weeidl.gogodag.model.RecentsData;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    String string = "здесь может быть ваша реклама";
    View view;
    private FlipTab flipTab;
    private List places, allPlaces;
    private static boolean left = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);
        view.findViewById(R.id.button_hotel).setOnClickListener(v -> {
            MainActivity.manager.beginTransaction().replace(R.id.container, new HotelFragment()).commit();
        });
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        places = new ArrayList<RecentsData>();
        allPlaces = new ArrayList<RecentsData>();
           places.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_1));
           places.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
           places.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
           places.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
           places.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
           places.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
           places.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_7));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_1));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_4));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_5));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_6));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_2));
        allPlaces.add(new RecentsData("база данных пока отсутствует", "Indea", "200$", string, null, R.drawable.test_3));


    }

    @Override
    public void onViewCreated(View view, Bundle saved){
        flipTab = getActivity().findViewById(R.id.flipTab);
        ViewPager viewPager = getView().findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getContext(), new List[]{places, allPlaces}));
        if (!left){
            viewPager.setCurrentItem(2);
            flipTab.selectRightTab(false);
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    flipTab.selectLeftTab(true);
                }else if(position == 1){
                    flipTab.selectRightTab(true);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        flipTab.setTabSelectedListener(new FlipTab.TabSelectedListener() {
            @Override
            public void onTabSelected(boolean b, @NotNull String s) {
                left = b;
                if (b){
                    viewPager.setCurrentItem(0);
                }else{
                    viewPager.setCurrentItem(1);
                }
            }

            @Override
            public void onTabReselected(boolean b, @NotNull String s) {

            }
        });
    }
}