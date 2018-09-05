/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import View.CadastroCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Santana
 */
public class ControleCadastroCliente {

    CadastroCliente view;
    int idCliente;

    public void iniciarCadastroCliente() {
        view = new CadastroCliente(this);
        view.getBtSalvarEdicao().setVisible(false);
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
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        view.dispose();
        iniciarCadastroCliente();
    }
    
    public void fechar(){
        view.dispose();
    }
    
    public void editar(int i){
        idCliente = i;
        iniciarCadastroCliente();
        view.getBtSalvarEdicao().setVisible(true);
        view.getBtSalvarCliente().setVisible(false);
        ArrayList<Cliente> clientes = new BancoClientes().mostrarClientes();
        view.getTxtNome().setText(clientes.get(i).getNome());
        view.getTxtCpf().setText(clientes.get(i).getCpf());
        view.getTxtRg().setText(clientes.get(i).getRg());
        view.getTxtDataNascimento().setText(clientes.get(i).getDataNasciemnto());
        view.getTxtTelefone().setText(clientes.get(i).getTelefone());
        view.getTxtEndereco().setText(clientes.get(i).getEndereco());
    }
    
    public void salvarEdicao(String nome, String cpf, String rg, String dataNascimento, String telefone, String endereco) {

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setRg(rg);
        cliente.setDataNasciemnto(dataNascimento);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);

        ArrayList<Cliente> clientes = new BancoClientes().mostrarClientes();
        clientes.remove(idCliente);
        clientes.add(idCliente, cliente);
        
        new BancoClientes().editarCliente(clientes);
    }

}
