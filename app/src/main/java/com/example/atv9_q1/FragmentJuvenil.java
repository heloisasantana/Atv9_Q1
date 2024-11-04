package com.example.atv9_q1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class FragmentJuvenil extends Fragment {

    private EditText editNome, editDataNascimento, editBairro, editAnosPratica;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_juvenil, container, false);

        editNome = view.findViewById(R.id.editNome);
        editDataNascimento = view.findViewById(R.id.editDataNascimento);
        editBairro = view.findViewById(R.id.editBairro);
        editAnosPratica = view.findViewById(R.id.editAnosPratica);
        Button buttonCadastrar = view.findViewById(R.id.buttonCadastrar);

        buttonCadastrar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String dataNascimento = editDataNascimento.getText().toString();
            String bairro = editBairro.getText().toString();
            int anosPratica = Integer.parseInt(editAnosPratica.getText().toString());

            AtletaJuvenil atletaJuvenil = new AtletaJuvenil(nome, dataNascimento, bairro, anosPratica);
            Toast.makeText(view.getContext(), atletaJuvenil.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}