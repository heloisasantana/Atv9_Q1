package com.example.atv9_q1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentSenior extends Fragment {

    private EditText editNome, editDataNascimento, editBairro;
    private CheckBox checkProblemasCardiacos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_senior, container, false);

        editNome = view.findViewById(R.id.editNome);
        editDataNascimento = view.findViewById(R.id.editDataNascimento);
        editBairro = view.findViewById(R.id.editBairro);
        checkProblemasCardiacos = view.findViewById(R.id.checkProblemasCardiacos);
        Button buttonCadastrar = view.findViewById(R.id.buttonCadastrar);

        buttonCadastrar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String dataNascimento = editDataNascimento.getText().toString();
            String bairro = editBairro.getText().toString();
            boolean problemasCardiacos = checkProblemasCardiacos.isChecked();

            AtletaSenior atletaSenior = new AtletaSenior(nome, dataNascimento, bairro, problemasCardiacos);
            Toast.makeText(view.getContext(), atletaSenior.toString(), Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
