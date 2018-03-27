package com.example.intel.innoprojnew2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.intel.innoprojnew2.Fragments.English;
import com.example.intel.innoprojnew2.R;

import org.w3c.dom.Text;

/**
 * Created by intel on 12/03/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Myholder> {

    private Context context;
    private String text[];

    public RecyclerAdapter(Context context, String[] text) {
        this.context = context;
        this.text = text;
    }

    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_layout,parent,false);
        Myholder viewholder=new Myholder(layout);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(Myholder holder, int position) {
    holder.tv.setText(text[position]);
    }

    @Override
    public int getItemCount() {
        return text.length;
    }

    public class Myholder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView tv;

        public Myholder(View itemView) {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.grid_text);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
        int id=getAdapterPosition();
            switch(id)
            {
                case 0:
                    Intent i=new Intent(context, English.class);
                    context.startActivity(i);
            }
        }
    }
}
