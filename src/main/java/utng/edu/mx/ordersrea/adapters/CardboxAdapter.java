package utng.edu.mx.ordersrea.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import utng.edu.mx.ordersrea.R;
import utng.edu.mx.ordersrea.model.Cardbox;


/**
 * Created by Martha on 23/02/2017.
 */
public class CardboxAdapter extends RecyclerView.Adapter <CardboxAdapter.CardboxViewHolder>
        implements View.OnClickListener {

    List<Cardbox> cardboxes;
    View.OnClickListener listener;
    //Constructor
    public CardboxAdapter(List<Cardbox> cardboxes){
        this.cardboxes=cardboxes;
    }
    //getter and setter de listener
    public View.OnClickListener getListener() {
        return listener;
    }

    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public CardboxAdapter.CardboxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //se inflael cardview al reciclerview
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardbox_layout,parent,false);
        CardboxViewHolder holder=new CardboxViewHolder(view);
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(CardboxAdapter.CardboxViewHolder holder, int position) {
        holder.tvCardboxName.setText(cardboxes.get(position).getName());
        holder.tvCardboxDifficulty.setText(String.valueOf(cardboxes.get(position).getDifficulty()));

        holder.iv_Cardbox.setImageResource(R.mipmap.ic_launcher);
        holder.setListener(this);

    }

    @Override
    public int getItemCount() {
        return cardboxes.size();
    }
    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }

    }

    public static class CardboxViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{
        CardView cvCardbox;
        TextView tvCardboxName;
        TextView tvCardboxDifficulty;

        ImageView iv_Cardbox;
        ImageButton btEditCardbox;
        ImageButton btDeleteCardbox;
        View.OnClickListener listener;




        public CardboxViewHolder(View itemView) {
            super(itemView);
            cvCardbox=(CardView)itemView.findViewById(R.id.cv_cardbox);
            iv_Cardbox=(ImageView)itemView.findViewById(R.id.iv_cardbox);
            tvCardboxName=(TextView)itemView.findViewById(R.id.tv_cardbox_name);
            tvCardboxDifficulty=(TextView)itemView.findViewById(R.id.tv_cardbox_difficulty);

            btEditCardbox=(ImageButton) itemView.findViewById(R.id.bt_edit_cardbox);
            btDeleteCardbox=(ImageButton) itemView.findViewById(R.id.bt_delete_cardbox);
            btEditCardbox.setOnClickListener(this);
            btDeleteCardbox.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            if (listener!=null){
                listener.onClick(v);
            }
        }

        public void setListener(View.OnClickListener listener){
            this.listener=listener;

        }
    }

}
