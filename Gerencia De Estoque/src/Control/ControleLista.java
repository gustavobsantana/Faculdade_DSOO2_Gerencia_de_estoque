/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import Model.Funcionario;
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

    public static void main(String args[]) {
        selecionarLista("funcionario");

    }

    public static void selecionarLista(String controle) {
        Lista view = new Lista();
        JList lista = view.getLista();
        DefaultListModel model = new DefaultListModel();
        lista.setModel(model);
        model.clear();
        
        if (controle.equals("cliente")) {
            ArrayList<Object> clientes = new BancoClientes().MostrarClientes();
            for (Object object : clientes) {
                model.addElement(((Cliente) object).getNome());
            }
        }

        if (controle.equals("funcionario")) {
            ArrayList<Object> funcionarios = new BancoFuncionarios().mostrarFuncionarios();
            for (Object object : funcionarios) {
                model.addElement(((Funcionario) object).getNome());
            }
        }

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int i = lista.getSelectedIndex();
                ArrayList<Object> funcionarios = new BancoFuncionarios().mostrarFuncionarios();
                view.getTxtNome().setText(((Funcionario)funcionarios.get(i)).getNome());
                view.getTxtCpf().setText(((Funcionario)funcionarios.get(i)).getCpf());
            }
        });

        view.setVisible(true);
    }
}
