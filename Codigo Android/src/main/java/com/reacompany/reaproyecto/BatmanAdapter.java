package com.reacompany.reaproyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Martha on 31/12/2016.
 */
public class BatmanAdapter extends ArrayAdapter<Batman> {
public BatmanAdapter(Context context, ArrayList<Batman> batmans){
        super(context,0,batmans);
        }

@Override
public View getView(int position, View convertView, ViewGroup parent){
        Batman batman=getItem(position);
        if(convertView==null){
        convertView= LayoutInflater.from(getContext())
        .inflate(R.layout.batman,parent,false);
        }
        TextView txvBatman=(TextView)
        convertView.findViewById(R.id.txv_bat);
        txvBatman.setText(batman.getNombre()+" "+batman.getGeneracion());

        return convertView;
        }
}
