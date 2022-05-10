/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Clientes {
    private String nome;
    private String cpf;
    private ArrayList<CCorrente> contas;

    public Clientes(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        contas = new ArrayList<CCorrente>();
    }

    public void addContas(CCorrente conta){
        contas.add(conta);
    }

    public ArrayList<CCorrente> getContas(){
        return contas;
    }
    
    public String getNome(){
        return this.nome;    
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String toString(){
        return (this.nome+": "+this.contas);
    }
}
