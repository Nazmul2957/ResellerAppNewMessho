package com.example.resellerappnewmessho.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.resellerappnewmessho.Customadapter.RecycleAdapter;
import com.example.resellerappnewmessho.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Collections extends Fragment {
    private RecyclerView homeRecyclerview;

    public Collections() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_collections, container, false);
        homeRecyclerview=v.findViewById(R.id.collection_first_recycler_view);
        homeRecyclerview.setHasFixedSize(true);
        homeRecyclerview.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        RecycleAdapter recycleAdapter=new RecycleAdapter();
        homeRecyclerview.setAdapter(recycleAdapter);



        // Inflate the layout for this fragment
        return v;
    }

}
