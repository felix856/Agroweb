package com.example.agroweb;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Agricultor {
    private Integer crmv;
    private String email;
    private Integer senha;

    public Agricultor(Integer crmv, String email, Integer senha) {
        this.crmv = crmv;
        this.email = email;
        this.senha = senha;
    }

    public Agricultor() {
    }

    public Integer getCrmv() {
        return crmv;
    }

    public void setCrmv(Integer crmv) {
        this.crmv = crmv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Agricultor").child(crmv.toString()).setValue(this);
    }

}
