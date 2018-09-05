/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Funcionario;
import View.CadastroFuncionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Gustavo Santana
 */
public class ControleCadastroFuncionario {

    CadastroFuncionario view;
    int idFuncionario;

    public void iniciarCadastroFuncionario() {
        view = new CadastroFuncionario(this);
        view.getBtSalvarEdicao().setVisible(false);
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

        //Confere se o usuario já existe no sistema
        Boolean ok = false;
        ArrayList<Funcionario> funcionarios = new BancoFuncionarios().mostrarFuncionarios();
        for (Funcionario f : funcionarios) {
            if (f.getUsuario().equals(funcionario.getUsuario())) {
                ok = false;
                break;
            } else {
                ok = true;
            }
        }
        if (ok) {
            new BancoFuncionarios().adicionarFuncionario(funcionario);
            JOptionPane.showMessageDialog(null, "Funcionario salvo no sistema");
            view.dispose();
            iniciarCadastroFuncionario();

        } else {
            JOptionPane.showMessageDialog(null, "Usuario existente no sistema");
        }

    }
    
    public void fechar(){
        view.dispose();
    }
    
    
    public void editar(int i){
        idFuncionario = i;
        iniciarCadastroFuncionario();
        view.getBtSalvarEdicao().setVisible(true);
        view.getBtSalvarFuncionario().setVisible(false);
        ArrayList<Funcionario> funcionarios = new BancoFuncionarios().mostrarFuncionarios();
        view.getTxtNome().setText(funcionarios.get(i).getNome());
        view.getTxtCargo().setText(funcionarios.get(i).getCargo());
        view.getTxtCpf().setText(funcionarios.get(i).getCpf());
        view.getTxtRg().setText(funcionarios.get(i).getRg());
        view.getTxtDataNascimento().setText(funcionarios.get(i).getDataNasciemnto());
        view.getTxtTelefone().setText(funcionarios.get(i).getTelefone());
        view.getTxtEndereco().setText(funcionarios.get(i).getEndereco());
        view.getTxtSalario().setText(funcionarios.get(i).getSalario());
        view.getTxtUsuario().setText(funcionarios.get(i).getUsuario());
        view.getTxtSenha().setText(funcionarios.get(i).getSenha());
        
    }
    
    public void salvarEdicao(String nome, String cpf, String rg, String dataNascimento,
            String telefone, String endereco, String cargo, String salario, String usuario, String senha){
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
        
        ArrayList<Funcionario> funcionarios = new BancoFuncionarios().mostrarFuncionarios();
        funcionarios.remove(idFuncionario);
        funcionarios.add(idFuncionario, funcionario);
        
        new BancoFuncionarios().editarFuncionario(funcionarios);
    }


}
