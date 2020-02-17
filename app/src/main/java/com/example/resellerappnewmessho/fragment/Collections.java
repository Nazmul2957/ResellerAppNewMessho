package com.example.resellerappnewmessho.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.resellerappnewmessho.Customadapter.ProductCategoryAdapter;
import com.example.resellerappnewmessho.Customadapter.ProductSocialAdapter;
import com.example.resellerappnewmessho.Model.ProductModelR;
import com.example.resellerappnewmessho.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Collections extends Fragment {
    private RecyclerView catagoryrecycle,productrecycle;

    public Collections() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_collections, container, false);
        //category recycle
        catagoryrecycle=v.findViewById(R.id.collection_first_recycler_view);
        catagoryrecycle.setHasFixedSize(true);

        //catagoryrecycle.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        catagoryrecycle.setLayoutManager(new GridLayoutManager(getContext(),3,LinearLayoutManager.VERTICAL,false));
        ProductCategoryAdapter recycleAdapter=new ProductCategoryAdapter();
        catagoryrecycle.setAdapter(recycleAdapter);



        //----product model--
        ProductModelR p1=new ProductModelR("R.drawable.saree",
                "R.drawable.saree",
                "R.drawable.saree",
                "White Bella jewellery Sets",
                 "Starting from $ 20",
                "Shipping $70 $1"
                );
        ProductModelR p2=new ProductModelR("R.drawable.jewlary",
                "R.drawable.jewlary",
                "R.drawable.jewlary",
                "jewlary",
                "Starting from $ 20",
                "Shipping $70 $1"
        );
  List<ProductModelR> datalist= new ArrayList<>();
  datalist.add(p1);
  datalist.add(p2);
 //---------product recycle------
        productrecycle=v.findViewById(R.id.collection_2nd_recycler_view);
        productrecycle.setHasFixedSize(true);
        productrecycle.setNestedScrollingEnabled(false);
        productrecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        ProductSocialAdapter productAdaptor=new ProductSocialAdapter(getContext(),datalist);
        productrecycle.setAdapter(productAdaptor);
        // Inflate the layout for this fragment
        return v;
    }

}
