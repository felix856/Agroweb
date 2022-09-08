package com.example.agroweb;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Restaurante {
    private Integer cnpj;
    private String email;
    private String senha;

    public Restaurante() {
    }

    public Restaurante(Integer cnpj, String email, String senha) {
        this.cnpj = cnpj;
        this.email = email;
        this.senha = senha;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Restaurante").child(cnpj.toString()).setValue(this);
    }
}
