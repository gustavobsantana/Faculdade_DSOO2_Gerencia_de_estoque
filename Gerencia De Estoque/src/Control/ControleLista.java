/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import Model.Funcionario;
import Model.Produto;
import View.Lista;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Gustavo Santana
 */
public class ControleLista {

    DefaultListModel model;
    Lista view;
    JList lista;

    public void iniciarListaFuncionarios() {
        iniciarLista();
        ArrayList<Funcionario> funcionarios = new BancoFuncionarios().mostrarFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            model.addElement(funcionario.getNome());
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                view.getTxtNome().setText(funcionarios.get(i).getNome());
                view.getTxtCpf().setText(funcionarios.get(i).getCpf());
            }
        });

        view.setVisible(true);

    }

    public void iniciarListaClientes() {
        iniciarLista();
        ArrayList<Cliente> clientes = new BancoClientes().mostrarClientes();
        for (Cliente cliente : clientes) {
            model.addElement(cliente.getNome());
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                view.getTxtNome().setText(clientes.get(i).getNome());
                view.getTxtCpf().setText(clientes.get(i).getCpf());
            }
        });

        view.setVisible(true);

    }

    public void iniciarListaProdutos() {
        iniciarLista();
        view.getjLabel1().setText("Produto: ");
        view.getjLabel2().setText("Quantidade: ");
        ArrayList<Produto> produtos = new BancoProdutos().mostrarProdutos();
        for (Produto produto : produtos) {
            model.addElement(produto.getNome());
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                view.getTxtNome().setText(produtos.get(i).getNome());

                view.getTxtCpf().setText(produtos.get(i).getQuantidade() + "");
            }
        });

        view.setVisible(true);
    }

    public void iniciarLista() {
        view = new Lista();
        lista = view.getLista();
        model = new DefaultListModel();
        lista.setModel(model);
        model.clear();
    }
}
