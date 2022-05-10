/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Calendar;

/**
 *
 * @author Rodrigo Batista Pereira - BSI3
 */
public class CInvestimento extends CCorrente{
    private int dia_investimento, periodo;
    
    public CInvestimento(int num, float saldo, int dinv, int per) {
        super(num, saldo);
        this.dia_investimento = dinv;
        this.periodo = per;
    }
    
    public void atualizar_saldo() {
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
        if (dia == (this.dia_investimento + periodo)) {
            super.setSaldo((double) (super.getSaldo() * 1.20));
        } else {
            System.out.println("Ainda no dia do investimento");
        }
    }
    
}