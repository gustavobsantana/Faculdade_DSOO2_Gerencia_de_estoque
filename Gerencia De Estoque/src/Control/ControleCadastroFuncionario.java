/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Funcionario;

/**
 *
 * @author Gustavo Santana
 */
public class ControleCadastroFuncionario {
     public void cadastroFuncionario(String nome, String cpf, String rg, String dataNascimento,
             String telefone, String endereco,String cargo, String salario, String usuario, String senha){
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
        
        System.out.println(funcionario.getNome());
    }

}