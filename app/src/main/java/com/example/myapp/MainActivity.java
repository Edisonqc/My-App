package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EditTextNumeroA;
    private EditText EditTextNumeroB;
    private TextView TextViewRespuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextNumeroA = findViewById(R.id.EditTextNumeroA);
        EditTextNumeroB = findViewById(R.id.EditTextNumeroB);
        TextViewRespuesta = findViewById(R.id.TextViewRespuesta);
    }

    public void BtnSumar(View view){
        int n1=0, n2=0, respuesta=0;
        n1 = Integer.parseInt(EditTextNumeroA.getText().toString());
        n2 = Integer.parseInt(EditTextNumeroB.getText().toString());
        respuesta = n1 + n2;

        TextViewRespuesta.setText(String.valueOf(respuesta));
    }

    public void BtnResta(View view){
        int n1=0, n2=0, respuesta=0;
        n1 = Integer.parseInt(EditTextNumeroA.getText().toString());
        n2 = Integer.parseInt(EditTextNumeroB.getText().toString());
        respuesta = n1 - n2;

        TextViewRespuesta.setText(String.valueOf(respuesta));
    }

    public void BtnMulti(View view){
        int n1=0, n2=0, respuesta=0;
        n1 = Integer.parseInt(EditTextNumeroA.getText().toString());
        n2 = Integer.parseInt(EditTextNumeroB.getText().toString());
        respuesta = n1 * n2;

        TextViewRespuesta.setText(String.valueOf(respuesta));
    }

    public void BtnDivi(View view){
        int n1=0, n2=0, respuesta=0;
        n1 = Integer.parseInt(EditTextNumeroA.getText().toString());
        n2 = Integer.parseInt(EditTextNumeroB.getText().toString());
        respuesta = n1 / n2;

        TextViewRespuesta.setText(String.valueOf(respuesta));
    }
    

}