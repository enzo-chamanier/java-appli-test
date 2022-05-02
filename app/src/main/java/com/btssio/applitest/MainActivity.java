package com.btssio.applitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btEnvoyer;
    private EditText etNom;
    private EditText etPassword;
    private TextView tvAffiche;
    private Spinner spNiveau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNom=(EditText) findViewById(R.id.etNom);
        etPassword=(EditText) findViewById(R.id.etPassword);
        btEnvoyer=(Button) findViewById(R.id.btEnvoyer);
        tvAffiche=(TextView) findViewById(R.id.tvAffiche);
        spNiveau=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this,R.array.niveau, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spNiveau.setAdapter(adapter);
        spNiveau.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                choix = adapterView.get
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        });
    }
}