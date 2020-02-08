package com.example.resellerappnewmessho.Customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resellerappnewmessho.Model.ProductModelR;
import com.example.resellerappnewmessho.R;

import java.util.List;

public class RecycleProductSocialview extends RecyclerView.Adapter<RecycleProductSocialview.RecycleViewholder> {


List<ProductModelR> data;
Context context;
    public RecycleProductSocialview(Context context, List<ProductModelR> data){
       this.data=data;
       this.context=context;
    }

    @NonNull
    @Override
    public RecycleViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_with_scoial_view,parent,false);
        return new RecycleViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewholder holder, int position) {
            holder.imageView1.setImageResource(R.drawable.saree);
            holder.imageView2.setImageResource(R.drawable.jewlary);
            holder.imageView3.setImageResource(R.drawable.kurta);
            holder.productname.setText(data.get(position).getProductname());
            holder.shipingcost.setText(data.get(position).getShippingcost());
            holder.startingPrice.setText(data.get(position).getStartingPrice());
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public static class RecycleViewholder extends RecyclerView.ViewHolder{
        public ImageView imageView1,imageView2,imageView3;
        public TextView productname,startingPrice,shipingcost;

        public RecycleViewholder(@NonNull View itemView) {
            super(itemView);
              imageView1=itemView.findViewById(R.id.product_imageview1);
              imageView2=itemView.findViewById(R.id.product_imageview2);
              imageView3=itemView.findViewById(R.id.product_imageview3);
              productname=itemView.findViewById(R.id.productname);
              startingPrice=itemView.findViewById(R.id.product_starting_price);
              shipingcost=itemView.findViewById(R.id.shipping_price);




        }
    }
}
