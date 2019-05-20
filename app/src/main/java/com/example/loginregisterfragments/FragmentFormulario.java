package com.example.loginregisterfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFormulario extends Fragment {

    private DatosDelFormulario datosDelFormulario;

    public FragmentFormulario() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Reemplazar el return por un objeto View y despues incluir el return de ese objeto al cierre del metodo
        View vistaFromulario =  inflater.inflate(R.layout.fragment_fragment_formulario, container, false);

        // Los findViewById, se deben hacer sobre la vista, en este caso vistaFormulario
        // entonces vistaFormulario.findViewById.......
        final EditText userNameFromulario = vistaFromulario.findViewById(R.id.userNameFormulario);
        final EditText passwordFormulario = vistaFromulario.findViewById(R.id.passwordFromulario);
        Button botonFormulario = vistaFromulario.findViewById(R.id.botonFormulario);

        // incluimos el onClikListener
        // al boton.setOnClikListener(new ctrl + space sobre escribo el View.onClikListener
        botonFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Primera prueba", Toast.LENGTH_SHORT).show();
                String username = userNameFromulario.getText().toString();
                String password = passwordFormulario.getText().toString();
                datosDelFormulario.recibirDatosFormulario(username,password);



            }
        });


        return vistaFromulario;
    }

    public interface DatosDelFormulario{
        public void recibirDatosFormulario(String usuario, String password);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.datosDelFormulario = (DatosDelFormulario) context;
    }
}
