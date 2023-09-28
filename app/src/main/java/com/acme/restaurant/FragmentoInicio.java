package com.acme.restaurant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoInicio extends Fragment {
    /**
     * Esta implementacion es similar a la de Ficha de Evaluacion 6 - Proyecto Fragmentos.
     * Se agrega el evento setOnClickListener para el boton Reservar del fragmento_inicio.xml.
     */
    View view;
    Button botonInicioReservar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_inicio, container, false);
        botonInicioReservar = (Button) view.findViewById(R.id.btnInicioReservar);
        botonInicioReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Reservando mesa...", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
