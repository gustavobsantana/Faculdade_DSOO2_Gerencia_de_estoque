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
public class BancoClientes {

    private String NOMEARQUIVO = "dadosClientes.dat";

    ArrayList<Object> clientes = new ArrayList<Object>();

    public void AdicionarCliente(Cliente cliente) {
        clientes = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        clientes.add(cliente);
        Empacotamento.gravarArquivoBinario(clientes, NOMEARQUIVO);
    }

    public ArrayList<Cliente> mostrarClientes() {
        ArrayList<Object> listaObject = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        for (Object lista : listaObject) {
            Cliente cliente = new Cliente();
            cliente.setNome(((Cliente)lista).getNome());
            cliente.setCpf(((Cliente)lista).getCpf());
            cliente.setRg(((Cliente)lista).getRg());
            cliente.setDataNasciemnto(((Cliente)lista).getDataNasciemnto());
            cliente.setTelefone(((Cliente)lista).getTelefone());
            cliente.setEndereco(((Cliente)lista).getEndereco());
            listaClientes.add(cliente);
        }

        return listaClientes;
    }
    
    public void editarCliente(ArrayList<Cliente> _clientes){
        clientes = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        clientes.clear();
        clientes.addAll(_clientes);
        Empacotamento.gravarArquivoBinario(clientes, NOMEARQUIVO);
    }

}
