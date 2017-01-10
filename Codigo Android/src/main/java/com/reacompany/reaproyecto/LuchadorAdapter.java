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
public class LuchadorAdapter extends ArrayAdapter<Luchador> {
    public LuchadorAdapter(Context context, ArrayList<Luchador> luchadores){
        super(context,0,luchadores);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Luchador luchador= getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.luchador, parent, false);
        }
        TextView txvLuchador = (TextView)
                convertView.findViewById(R.id.txv_luc);
        txvLuchador.setText(luchador.getNombre() + " " + luchador.getCategoria());

        return convertView;
    }
}
