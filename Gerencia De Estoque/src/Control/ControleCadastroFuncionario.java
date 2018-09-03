/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Funcionario;
import View.CadastroFuncionario;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Santana
 */
public class ControleCadastroFuncionario {
    
    CadastroFuncionario view;
    
    public void iniciarCadastroFuncionario(){
        view = new CadastroFuncionario(this);
        view.setVisible(true);
    }

    public void cadastroFuncionario(String nome, String cpf, String rg, String dataNascimento,
            String telefone, String endereco, String cargo, String salario, String usuario, String senha) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setRg(rg);
        funcionario.setDataNasciemnto(dataNascimento);
        funcionario.setTelefone(telefone);
        funcionario.setEndereco(endereco);
        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);
        funcionario.setUsuario(usuario);
        funcionario.setSenha(senha);

        new BancoFuncionarios().adicionarFuncionario(funcionario);
    }


}
