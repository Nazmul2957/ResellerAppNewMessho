package com.example.resellerappnewmessho.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.resellerappnewmessho.Customadapter.Gridview_Adapter;
import com.example.resellerappnewmessho.Customadapter.ProductCategoryAdapter;
import com.example.resellerappnewmessho.Customadapter.ProductSocialAdapter;
import com.example.resellerappnewmessho.Model.ProductModelR;
import com.example.resellerappnewmessho.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {
     RecyclerView productrecycle,categoryView;
     GridView gridView;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home2, container, false);


        //----product model--
        ProductModelR p1 = new ProductModelR("R.drawable.saree",
                "R.drawable.saree",
                "R.drawable.saree",
                "White Bella jewellery Sets",
                "Starting from $ 20",
                "Shipping $70 $1"
        );
        ProductModelR p2 = new ProductModelR("R.drawable.jewlary",
                "R.drawable.jewlary",
                "R.drawable.jewlary",
                "jewlary",
                "Starting from $ 20",
                "Shipping $70 $1"
        );
        List<ProductModelR> datalist = new ArrayList<>();
        datalist.add(p1);
        datalist.add(p2);
        //-----product model End------------------

        //recycle adapter for category--------------

        categoryView=v.findViewById(R.id.home_productCategory);
        categoryView.setHasFixedSize(true);
        categoryView.setLayoutManager(new GridLayoutManager(getContext(),3,LinearLayoutManager.VERTICAL,false));
        ProductCategoryAdapter recycleAdapter=new ProductCategoryAdapter();
        categoryView.setAdapter(recycleAdapter);
       /*Gridview_Adapter adapter=new Gridview_Adapter(getContext());
         gridView=v.findViewById(R.id.gridtest);
         gridView.setAdapter(adapter);*/




        //recycle adapter for category End----------

        //recycle adapter for product item view----------
        productrecycle=v.findViewById(R.id.home_productItem);
        productrecycle.setHasFixedSize(true);
        productrecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        ProductSocialAdapter productAdaptor=new ProductSocialAdapter(getContext(),datalist);
        productrecycle.setAdapter(productAdaptor);





        // return view
        return v;
    }

}
