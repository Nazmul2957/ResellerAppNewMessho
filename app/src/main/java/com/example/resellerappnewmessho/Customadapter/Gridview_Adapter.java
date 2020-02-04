package com.example.resellerappnewmessho.Customadapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.resellerappnewmessho.HomeActivity;

public class Gridview_Adapter extends BaseAdapter {
    public Gridview_Adapter(HomeActivity homeActivity, String[] countryNames, int[] flags) {

    }

//    Context context;
//    int [] flags;
//    String [] countryNames;
//    private LayoutInflater inflater;

//    public Gridview_Adapter(Context context, String[] countryNames, int[] flags){
//        this.context=context;
//        this.countryNames=countryNames;
//        this.flags=flags;
//    }

    @Override
    public int getCount() {
//        return countryNames.length;
        return getCount();
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
//        if (view == null){
//            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            view = inflater.inflate(R.layout.gridview_model_design,viewGroup,false);
//
//
//        }
//
//        ImageView imageView = view.findViewById(R.id.image);
//        TextView textView = view.findViewById(R.id.text);
//        imageView.setImageResource(flags[i]);
//        textView.setText(countryNames[i]);
//        return view;
        return null;
    }
}
