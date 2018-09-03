/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import View.CadastroCliente;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Santana
 */
public class ControleCadastroCliente {

    CadastroCliente view;

    public void iniciarCadastroCliente() {
        view = new CadastroCliente(this);
        view.setVisible(true);
    }

    public void cadastroCliente(String nome, String cpf, String rg, String dataNascimento, String telefone, String endereco) {

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setRg(rg);
        cliente.setDataNasciemnto(dataNascimento);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);

        new BancoClientes().AdicionarCliente(cliente);
    }

}
