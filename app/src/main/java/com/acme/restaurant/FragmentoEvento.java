package com.acme.restaurant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoEvento extends Fragment {
    /**
     * Esta implementacion es similar a la de Ficha de Evaluacion 6 - Proyecto Fragmentos.
     * Se agrega el evento setOnClickListener para el boton Agendar del fragmento_eventos.xml.
     */
    View view;
    Button botonEventoAgendar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_eventos, container, false);
        botonEventoAgendar = (Button) view.findViewById(R.id.btnEventoAgendar);
        botonEventoAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Agendando evento...", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
