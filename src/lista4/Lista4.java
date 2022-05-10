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
public class Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaClientes lista = new ListaClientes();
        Clientes cli1 = new Clientes("Joice", "394.723.947-32");
        lista.addClientes(cli1);
        Clientes cli2 = new Clientes("João", "701.324.567-09");
        lista.addClientes(cli2);
        Clientes cli3 = new Clientes("Ivo", "435.456.324-45");
        lista.addClientes(cli3);
        Clientes cli4 = new Clientes("Ana", "730.043.786-05");
        lista.addClientes(cli4);
        Clientes cli5 = new Clientes("Carlos", "101.324.876-09");
        lista.addClientes(cli5);
        
        /*---------------------------------------------------*/
        
        CCorrente cc1 = new CCorrente(1,1000);
        cli1.addContas(cc1);
        CCorrente cc2 = new CCorrente(2,2500);
        cli2.addContas(cc2);
        CPoupanca cp1 = new CPoupanca(3, 1000, 1000);
        cli2.addContas(cp1);
        CEspecial ce1 = new CEspecial(4, 1500, 3000);
        cli3.addContas(ce1);
        CInvestimento ci1 = new CInvestimento (5, 2000,20, 10);
        cli3.addContas(ci1);
        CInvestimento ci2 = new CInvestimento (6, 5000, 20, 5);
        cli4.addContas(ci2);
        lista.imprimeClientes();
        
    }
    
}
