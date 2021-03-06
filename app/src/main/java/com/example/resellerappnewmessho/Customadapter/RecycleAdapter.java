package com.example.resellerappnewmessho.Customadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resellerappnewmessho.R;


public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ExampleViewHolder> {
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card_view,parent,false);
         return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
       holder.imageView.setImageResource(R.drawable.saree);
       holder.textView1.setText("saree");
       holder.textView2.setText("newitem");
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
           public ImageView imageView;
           public TextView textView1,textView2;
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.collectionsimage);
            textView1=itemView.findViewById(R.id.collectiontext);
            textView2=itemView.findViewById(R.id.text1);
        }
    }
}
