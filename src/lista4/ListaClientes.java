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
 * @author aluno
 */
public class ListaClientes {

    private List<Clientes> clientes;

    public ListaClientes() {
        clientes = new ArrayList<Clientes>();
    }

    public void addClientes(Clientes cli) {
        clientes.add(cli);
    }

    public void imprimeClientes() {
        for (Clientes cli : clientes) {
            System.out.println(cli);
        }
    }
    
    
}
