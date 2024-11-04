package com.example.atv9_q1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FragmentAmador extends Fragment {

    private EditText editNome, editDataNascimento, editBairro, editAcademia, editRecordeSegundos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_amador, container, false);

        editNome = view.findViewById(R.id.editNome);
        editDataNascimento = view.findViewById(R.id.editDataNascimento);
        editBairro = view.findViewById(R.id.editBairro);
        editAcademia = view.findViewById(R.id.editAcademia);
        editRecordeSegundos = view.findViewById(R.id.editRecordeSegundos);
        Button buttonCadastrar = view.findViewById(R.id.buttonCadastrar);

        buttonCadastrar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String dataNascimento = editDataNascimento.getText().toString();
            String bairro = editBairro.getText().toString();
            String academia = editAcademia.getText().toString();
            int recordeSegundos = Integer.parseInt(editRecordeSegundos.getText().toString());

            AtletaAmador atletaAmador = new AtletaAmador(nome, dataNascimento, bairro, academia, recordeSegundos);
            Toast.makeText(view.getContext(), atletaAmador.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
