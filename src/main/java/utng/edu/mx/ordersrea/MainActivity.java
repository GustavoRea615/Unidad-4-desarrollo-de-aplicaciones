package utng.edu.mx.ordersrea;

import android.database.DatabaseUtils;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.Calendar;

import utng.edu.mx.ordersrea.model.Cardbox;
import utng.edu.mx.ordersrea.model.Customer;
import utng.edu.mx.ordersrea.model.MethodPayment;
import utng.edu.mx.ordersrea.model.OrderDetail;
import utng.edu.mx.ordersrea.model.OrderHeader;
import utng.edu.mx.ordersrea.model.Product;
import utng.edu.mx.ordersrea.sqlite.DBOperations;
import utng.edu.mx.ordersrea.sqlite.OrderDB;


public class MainActivity extends AppCompatActivity {
    DBOperations data;
    public class DataTaskTest extends AsyncTask<Void,Void,Void> {
        @Override
        protected Void doInBackground(Void... params) {
            //inserciones
            String currentDate= Calendar.getInstance().getTime().toString();
            try{
                data.getDb().beginTransaction();
                //InsertCustomer
                String customer1=data.insertCustomer(new Customer(null,"Veronica","Del Topo","402558"));
                String customer2=data.insertCustomer(new Customer(null,"Carlos","Villagran","458852"));
                //Method
                String methodPayment1=data.insertMethodPayment(new MethodPayment(null,"Efectivo"));
                String methodPayment2=data.insertMethodPayment(new MethodPayment(null,"Cerdito"));
                //Products
                String product1=data.insertProduct(new Product(null, "Leche", 4, 120));
                String product2=data.insertProduct(new Product(null, "Galletas", 5, 45));
                String product3=data.insertProduct(new Product(null, "Queso", 149.5f, 45));
                String product4=data.insertProduct(new Product(null, "Papitas", 189.5f, 12));

                //Cardboxes
                String cardbox1=data.insertCardbox(new Cardbox(null, "xxx", 120));
                String cardbox2=data.insertCardbox(new Cardbox(null, "yyy",45));
                String cardbox3=data.insertCardbox(new Cardbox(null, "aaa", 45));
                String cardbox4=data.insertCardbox(new Cardbox(null, "bbb", 12));


                //Orders Header
                String order1=data.insertOrderHeader(new OrderHeader(null,customer1,methodPayment1,currentDate));
                String order2=data.insertOrderHeader(new OrderHeader(null,customer2,methodPayment2,currentDate));

                //Ordert dETAIL
                data.insertOrderDetail(new OrderDetail(order1,1,product1,5,2));
                data.insertOrderDetail(new OrderDetail(order1,2,product1,15,5));
                data.insertOrderDetail(new OrderDetail(order2,1,product1,35,26));
                data.insertOrderDetail(new OrderDetail(order2,2,product1,45,12));
                //ELIMINAR PEDIDO
                data.deleteOrderHeader(order1);
                //Actualizacioon
                data.updateCustomer(new Customer(customer2,"Gustavo ","Rea","4181144618"));
                data.getDb().setTransactionSuccessful();

            }finally {
                data.getDb().endTransaction();
            }
            //Querys
            Log.d("Customers", "Customers");
            DatabaseUtils.dumpCursor(data.getCustomers());
            Log.d("Method of Payment","Method of Payments");
            DatabaseUtils.dumpCursor(data.getMethodsPayment());
            Log.d("Products","Products");
            DatabaseUtils.dumpCursor(data.getProducts());
            Log.d("Order Headers","Order HeaderS");
            DatabaseUtils.dumpCursor(data.getOrderDetails());
            Log.d("Order Details","Order Details");
            DatabaseUtils.dumpCursor(data.getOrderDetails());

            Log.d("Cardboxes","Cardboxes");
            DatabaseUtils.dumpCursor(data.getCardboxes());

            return null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getApplicationContext().deleteDatabase(OrderDB.DATABASE_NAME);
        data=DBOperations.getDBOperations(getApplicationContext());
        new DataTaskTest().execute();

    }
}
