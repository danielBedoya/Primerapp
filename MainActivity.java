package com.example.danfe.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nomusu;
    private EditText contrasenia;
    private TextView verpantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomusu = (EditText)findViewById(R.id.nombredeusuario);
        contrasenia = (EditText)findViewById(R.id.contrasena);
        verpantalla = (TextView)findViewById(R.id.printinscreen);
    }
    public void verificar_usuario(View view){
        String usr = nomusu.getText().toString();
        String cont = contrasenia.getText().toString();
        verpantalla.setText(usr);
    }
}
