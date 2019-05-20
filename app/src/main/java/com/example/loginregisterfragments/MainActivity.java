package com.example.loginregisterfragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.loginregisterfragments.WelcomeActivity.USUARIO;


public class MainActivity extends AppCompatActivity implements FragmentFormulario.DatosDelFormulario {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentFormulario unFormulario = new FragmentFormulario();
        FragmentManager unFormulaiorManager = getSupportFragmentManager();
        FragmentTransaction unFormularioTransaccion = unFormulaiorManager.beginTransaction();
        unFormularioTransaccion.add(R.id.contenedorFormularioFragment, unFormulario);
        unFormularioTransaccion.commit();




    }

    @Override
    public void recibirDatosFormulario(String usuario, String password) {
        Intent unIntent = new Intent(MainActivity.this, WelcomeActivity.class);
        Bundle unBundle = new Bundle();
        unBundle.putString(USUARIO, usuario);
        unIntent.putExtras(unBundle);
        startActivity(unIntent);
    }
}
