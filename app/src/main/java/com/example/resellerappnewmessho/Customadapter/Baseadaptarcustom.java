package com.example.resellerappnewmessho.Customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.resellerappnewmessho.R;


class Baseadaptarcustom extends ArrayAdapter<String> {
private final Context context;
private final String[] catagoryname;
private final String[] newitem;
private final int[] imageid;


public Baseadaptarcustom(Context context, String[] catagoryname, String[] newitem, int[] imageid  ) {
        super(context, R.layout.collections_gridview_sample_design,catagoryname);
        this.context=context;
        this.catagoryname=catagoryname;
        this.newitem=newitem;
        this.imageid=imageid;

}
@Override
public View getView(int position, View view, ViewGroup parent){
        LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview= layoutInflater.inflate(R.layout.collections_gridview_sample_design,parent,false);
        ImageView Imagevi= rowview.findViewById(R.id.collectionsimage);
        TextView Catagoryname=(TextView) rowview.findViewById(R.id.collectiontext);
        TextView Newitem=(TextView)rowview.findViewById(R.id.text1);
        Imagevi.setImageResource(imageid[position]);
        Catagoryname.setText(catagoryname[position]);
        Newitem.setText(newitem[position]);
        return rowview;

        }
        }

