package com.reacompany.reaproyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Martha on 01/01/2017.
 */
public class NaranjaAdapter extends ArrayAdapter<Naranja> {
    public NaranjaAdapter(Context context, ArrayList<Naranja> naranjas) {
        super(context, 0, naranjas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Naranja naranja = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.naranja, parent, false);
        }
        TextView txvNaranja = (TextView)
                convertView.findViewById(R.id.txv_nar);
        txvNaranja.setText(naranja.getEstado() + " " + naranja.getSabor());

        return convertView;
    }
}

