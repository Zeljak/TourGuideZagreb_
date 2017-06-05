package com.example.mara.tourguidezagreb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create a list of Eat Places
        final ArrayList<Place> categories = new ArrayList<>();
        categories.add(new Place(R.string.restaurant_ab_ovo, R.string.info_la_ab_ovo, R.drawable.abovo));
        categories.add(new Place(R.string.restaurant_zinfandel, R.string.info_zinfandel, R.drawable.zinfandels));
        categories.add(new Place(R.string.restaurant_la_struk, R.string.info_la_struk, R.drawable.lastruk));
        categories.add(new Place(R.string.restaurant_zrno, R.string.info_zrno, R.drawable.zrno));
        categories.add(new Place(R.string.restaurant_rocket, R.string.info_rocket_burger, R.drawable.rocketburger));

        //Create a new {@link ArrayAdapter for eat category
        final PlaceAdapter adapter = new PlaceAdapter(getActivity(), categories, R.color.eat_category);

        final ListView placesListView = (ListView) rootView.findViewById(R.id.list);

        placesListView.setAdapter(adapter);

        placesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = adapter.getItem(position);
            }
        });


        return rootView;
    }
}


