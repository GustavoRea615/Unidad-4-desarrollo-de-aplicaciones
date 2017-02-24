package utng.edu.mx.ordersrea;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import utng.edu.mx.ordersrea.adapters.CardboxAdapter;
import utng.edu.mx.ordersrea.model.Cardbox;
import utng.edu.mx.ordersrea.sqlite.DBOperations;


/**
 * Created by Martha on 23/02/2017.
 */
public class CardboxActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etDifficulty;
    private Button btSaveCardbox;
    private DBOperations operations;
    private Cardbox cardbox= new Cardbox();
    private RecyclerView rvCardboxes;
    private List<Cardbox> cardboxes=new ArrayList<Cardbox>();
    private CardboxAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardbox);
        //iniciacion de la isntancia
        operations=DBOperations.getDBOperations(getApplicationContext());
        cardbox.setIdCardbox("");


        initComponents();
    }
    private void initComponents(){
        rvCardboxes=(RecyclerView)findViewById(R.id.rv_cardbox_list);
        rvCardboxes.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        rvCardboxes.setLayoutManager(layoutManager);
        //
       getCardboxes();
        adapter=new CardboxAdapter(cardboxes);

        adapter.setListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bt_delete_cardbox:
                        operations.deleteCardbox(cardboxes.
                                get(rvCardboxes.getChildPosition((View) v.getParent().getParent())).getIdCardbox());
                        getCardboxes();
                        adapter.notifyDataSetChanged();
                        break;
                    case R.id.bt_edit_cardbox:

                        Toast.makeText(getApplicationContext(), "Editar", Toast.LENGTH_SHORT).show();
                        Cursor c = operations.getCardboxById(cardboxes.get(
                                rvCardboxes.getChildPosition(
                                        (View) v.getParent().getParent())).getIdCardbox());
                        if (c != null) {
                            if (c.moveToFirst()) {
                                cardbox = new Cardbox(c.getString(1), c.getString(2), c.getInt(3));
                            }
                            etName.setText(cardbox.getName());
                            etDifficulty.setText(String.valueOf(cardbox.getDifficulty()));

                        } else {
                            Toast.makeText(getApplicationContext(), "Registro no encontrado", Toast.LENGTH_SHORT).show();
                        }
                        break;
                }

            }
        });
        rvCardboxes.setAdapter(adapter);

        etName=(EditText)findViewById(R.id.et_name);
        etDifficulty=(EditText)findViewById(R.id.et_difficulty);

        btSaveCardbox=(Button)findViewById(R.id.bt_save_cardbox);

        btSaveCardbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!cardbox.getIdCardbox().equals("")){
                    cardbox.setName(etName.getText().toString());
                    cardbox.setDifficulty(Integer.parseInt(etDifficulty.getText().toString()));

                    operations.updateCardbox(cardbox);

                }else {
                    cardbox = new Cardbox("", etName.getText().toString(), Integer.parseInt(etDifficulty.getText().toString()));
                    operations.insertCardbox(cardbox);
                }
                getCardboxes();
                clearData();
                adapter.notifyDataSetChanged();
            }
        });

    }
    private void getCardboxes(){
        Cursor c =operations.getCardboxes();
        cardboxes.clear();
        if(c!=null){
            while (c.moveToNext()){
                cardboxes.add(new Cardbox(c.getString(1),c.getString(2),c.getInt(3)));
            }
        }

    }

    private void clearData(){
        etName.setText("");
        etDifficulty.setText("");



        cardbox=null;
        cardbox= new Cardbox();
        cardbox.setIdCardbox("");
    }
}
