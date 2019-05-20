package com.example.loginregisterfragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    public final static String USUARIO = "usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent unIntentRecibido = getIntent();
        Bundle unBundleRecibido = unIntentRecibido.getExtras();
        String usuario = unBundleRecibido.getString(USUARIO);
        Toast.makeText(this, usuario, Toast.LENGTH_SHORT).show();

        WelcomeFragment unFragmentWelcome = new WelcomeFragment();
        unFragmentWelcome.setArguments(unBundleRecibido);
        FragmentManager unFragmentWelcomeManager = getSupportFragmentManager();
        FragmentTransaction unFragmentWelcomeTransaction = unFragmentWelcomeManager.beginTransaction();
        unFragmentWelcomeTransaction.add(R.id.contenedorWelcomeFragment, unFragmentWelcome);
        unFragmentWelcomeTransaction.commit();



    }
}
