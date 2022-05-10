/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Batista Pereira - BSI3
 */
public class Cofrinho {
    private List<Moeda> moedas;
    
    public Cofrinho(){
        moedas = new ArrayList<Moeda>();
    }
    
    public void adicionar(Moeda moeda){
        moedas.add(moeda);
    }
    
    public double calcularTotal(){
        double soma = 0;
        for(Moeda i:moedas){
            soma+=i.getValor();
        }
        
        return soma;
    }
    
    public double contarMoeda(){
        return moedas.size();
    }
    
    public int moedasPorValor(double valor) {
        int count = 0;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() == valor) {
                count++;
            }
        }

        return count;
    }

    public double maiorValor() {
        double valorMaximo = 0;
        for (Moeda moeda : moedas) {
            if (moeda.getValor() > valorMaximo) {
                valorMaximo = moeda.getValor();
            }
        }

        return valorMaximo;
    }
}
