/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Santana
 */
public class BancoClientes{
    private String NOMEARQUIVO = "dadosClientes.dat";
    
    ArrayList<Object> clientes = new ArrayList<Object>();
    
    public void AdicionarCliente(Cliente cliente){
        clientes = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        clientes.add(cliente);
        Empacotamento.gravarArquivoBinario(clientes, NOMEARQUIVO);
    }
    
    public ArrayList<Object> MostrarClientes(){
        return Empacotamento.lerArquivoBinario(NOMEARQUIVO);
    }
    
}
