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
public class CEspecial extends CCorrente{
    private double limite;
    
    public CEspecial(int num, double saldo, double limite){
        super(num, saldo);
        this.limite = limite;
    }
    
    @Override
    public void debitar(double valor) {
        if (valor <= (super.getSaldo() + this.limite)) {
            super.setSaldo(super.getSaldo() - valor);
        } else {
            System.out.print("Saldo Insuficiente");
        }
    }
}