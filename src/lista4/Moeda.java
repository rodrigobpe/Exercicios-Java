/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author aluno
 */
public class Moeda {
    private double valor;
    private String nome;
    
    public Moeda(double v, String nome){
        this.valor = v;
        this.nome = nome;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public String getNome(){
        return this.nome;
    }
}