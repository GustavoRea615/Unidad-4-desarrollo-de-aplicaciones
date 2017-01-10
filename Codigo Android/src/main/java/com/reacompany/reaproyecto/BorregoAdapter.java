package com.reacompany.reaproyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by eduardo on 13/09/2016.
 */
public class BorregoAdapter extends ArrayAdapter<Borrego>{
    public BorregoAdapter(Context context, ArrayList<Borrego> ines){
        super(context,0,ines);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Borrego borrego = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.borrego,parent,false);
        }
        TextView txvIne = (TextView)
                convertView.findViewById(R.id.txv_ine);
        txvIne.setText(borrego.getNombre()+" "+ borrego.getNumero());

        return convertView;
    }
}
