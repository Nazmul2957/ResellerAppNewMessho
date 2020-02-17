package com.example.resellerappnewmessho.Customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.resellerappnewmessho.HomeActivity;
import com.example.resellerappnewmessho.R;

public class Gridview_Adapter extends BaseAdapter {


    Context context;
    private LayoutInflater inflater;
    public Gridview_Adapter(Context context){
        this.context=context;

    }

    @Override
    public int getCount() {
        return 9;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sample_product_category_view,null,false);




        ImageView imageView = view.findViewById(R.id.collections_image);
        TextView textView = view.findViewById(R.id.collectiontext);
        TextView textView2 = view.findViewById(R.id.collectiontext2);
        imageView.setImageResource(R.drawable.saree);
        textView.setText("saree");
        textView.setText("100 new");
        return view;

    }
}
