package com.example.loginregisterfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.loginregisterfragments.WelcomeActivity.USUARIO;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_welcome, container, false);

        TextView textView = vista.findViewById(R.id.textoWelcome);
        Bundle unBandleUsuario = getArguments();
        String usuario = unBandleUsuario.getString(USUARIO);
        textView.setText(usuario);

        return vista;
    }

}
