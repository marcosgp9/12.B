package com.example.a12b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = (TextView) findViewById(R.id.texto);
    }

    public void mostrarMensaje(View view){
        Toast.makeText(this,"Estoy mamadisimo.",Toast.LENGTH_LONG).show();
    }

    public void reiniciarContador(View view){
        contador.setText("0");
    }

    public void countUp(View view) {
        String cont = contador.getText().toString();
        int numero = Integer.parseInt(cont);
        numero++;
        String nuevoNumero = String.valueOf(numero);
        contador.setText(nuevoNumero);
    }
}
