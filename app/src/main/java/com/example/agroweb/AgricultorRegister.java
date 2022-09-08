package com.example.agroweb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AgricultorRegister extends AppCompatActivity {
    EditText crmv, email, senha, senhaConfirm;
    Boolean exists = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricultor_register);
        getSupportActionBar().hide();
        crmv = findViewById(R.id.cnpjRegister);
        email = findViewById(R.id.emailRegister);
        senha = findViewById(R.id.senhaRegister);
        senhaConfirm = findViewById(R.id.confirmSenhaRegister);
    }

    public void register(View view){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Agricultor");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
               /*
               for (DataSnapshot d : snapshot.getChildren()){
                    //percorrer e visualizar se temos um agricultor com cmdv ou email iguais
                    if(d.getValue(Agricultor.class).getCrmv() == Integer.parseInt(crmv.getText().toString()) || d.getValue(Agricultor.class).getEmail().equals(email.getText().toString())){
                        msg("Email ou Crmv já cadastrados");
                        exists = true;
                        break;
                    }
                }

                if(exists == false){
                    if(validaSenha(senha.getText().toString(), senhaConfirm.getText().toString()) == true){
                        Agricultor agro = new Agricultor(Integer.parseInt(crmv.getText().toString()), email.getText().toString(), senha.getText().toString());
                        agro.salvar();
                    }else{
                        msg("Senha Nao Compativeis");
                    }

                }
                */
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void msg(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_LONG);
    }

    public boolean validaSenha(String senha, String senhaConfirm){
        if(senha.equals(senhaConfirm)){
            return true;
        }
        return false;
    }

    public void trocaTela(View view){
        Intent i = new Intent(this, LocalizacaoAgricultor.class);
        startActivity(i);
    }
}