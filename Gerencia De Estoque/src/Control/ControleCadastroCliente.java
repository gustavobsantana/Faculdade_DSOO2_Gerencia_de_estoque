/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Santana
 */
public class ControleCadastroCliente {
    public void cadastroCliente(String nome, String cpf, String rg, String dataNascimento, String telefone, String endereco){
        
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setRg(rg);
        cliente.setDataNasciemnto(dataNascimento);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);
        
        new BancoClientes().AdicionarCliente(cliente);
    }

    public void MostrarClientes() {
        ArrayList<Object> lista = new BancoClientes().MostrarClientes();
        for (Object object : lista) {
            System.out.println(((Cliente)object).getNome());
        }
    }
}
