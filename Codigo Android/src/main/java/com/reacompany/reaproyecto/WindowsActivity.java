package com.reacompany.reaproyecto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WindowsActivity extends MainActivity {

    private EditText edtVer;
    private EditText edtSer;
    private EditText edtPro;
    private Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);

        edtVer = (EditText)findViewById(R.id.edt_ver);
        edtSer = (EditText)findViewById(R.id.edt_ser);
        edtPro=(EditText)findViewById(R.id.edt_pro);
        btnGuardar = (Button)findViewById(R.id.btn_guardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Windows windows = Windows.getWindows();
                windows.setVersion(edtVer.getText().toString());
                windows.setSerial(edtSer.getText().toString());
                windows.setPropietario(edtPro.getText().toString());

                Toast.makeText(WindowsActivity.this, "Windows"
                                + "\nVersion: " + windows.getVersion()
                                + "\nSerial: " + windows.getSerial()
                                + "\nPropietario: " + windows.getPropietario(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
