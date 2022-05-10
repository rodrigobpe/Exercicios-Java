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
public class CPoupanca extends CCorrente{
    private double saldominimo;
    
    public CPoupanca(int num, double saldo, double saldoMinimo){
        super(num, saldo);
        this.saldominimo = saldoMinimo;
    }
    
    @Override
    public void debitar(double valor) {
        if (valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - valor);
            if (super.getSaldo() < this.saldominimo){
                this.saldominimo = super.getSaldo();}
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    public void atualizar_saldo() {
        super.setSaldo((float) (super.getSaldo() + (this.saldominimo * 0.05)));
        this.saldominimo = super.getSaldo();

    }

    public double get_saldominimo(){
        return this.saldominimo;
    }   
    
}