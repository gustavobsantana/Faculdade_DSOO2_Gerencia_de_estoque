/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Funcionario;
import View.LoginFuncionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Santana
 */
public class ControleLogin {

    LoginFuncionario view;

    public void iniciarLogin() {
        view = new LoginFuncionario(this);
        view.setVisible(true);
    }

    public void loginFuncionario(String usuario, String senha) {

        Boolean permisao = false;
        ArrayList<Funcionario> funcionarios = new BancoFuncionarios().mostrarFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            if (usuario.equals(funcionario.getUsuario()) && senha.equals(funcionario.getSenha())) {
                permisao = true;
            }
        }

        if (permisao == true) {
            view.dispose();
            new ControleMenuPrincipal().iniciarMenuPrincipalFuncionario();
        } else {
            JOptionPane.showMessageDialog(null, "ERRO AO ACESSAR SISTEMA! \n Confira USUARIO e SENHA");
        }
    }

    public void loginAdm(String usuario, String senha) {
        if (usuario.equals("admin") && senha.equals("admin")) {
            view.dispose();
            new ControleMenuPrincipal().iniciarMenuPrincipalAdmin();
        } else {
            JOptionPane.showMessageDialog(null, "SEM PERMISSÃO PARA ADMINISTRADOR!");
        }
    }

}
