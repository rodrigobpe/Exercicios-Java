/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

/**
 *
 * @author Rodrigo Batista Pereira - BSI3
 */
public class CCorrente {
    private int numero;
    private double saldo;
    
    public CCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    
    }
    
    public void creditar(double valor){
        this.saldo += valor;
    }
    
    public void debitar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public  double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "Conta: " + this.numero + ". Saldo: " + this.saldo;
    }
}
