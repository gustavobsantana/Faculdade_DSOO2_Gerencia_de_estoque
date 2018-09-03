/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Santana
 */
public class BancoFuncionarios {

    private String NOMEARQUIVO = "dadosFuncionarios.dat";

    ArrayList<Object> funcionarios = new ArrayList<Object>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        funcionarios.add(funcionario);
        Empacotamento.gravarArquivoBinario(funcionarios, NOMEARQUIVO);
    }

    public ArrayList<Funcionario> mostrarFuncionarios() {
        ArrayList<Object> listaObject = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        for (Object lista : listaObject) {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(((Funcionario) lista).getNome());
            funcionario.setCpf(((Funcionario) lista).getCpf());
            funcionario.setRg(((Funcionario) lista).getRg());
            funcionario.setDataNasciemnto(((Funcionario) lista).getDataNasciemnto());
            funcionario.setTelefone(((Funcionario) lista).getTelefone());
            funcionario.setEndereco(((Funcionario) lista).getEndereco());
            funcionario.setCargo(((Funcionario) lista).getCargo());
            funcionario.setSalario(((Funcionario) lista).getSalario());
            funcionario.setUsuario(((Funcionario) lista).getUsuario());
            funcionario.setSenha(((Funcionario) lista).getSenha());
            
            listaFuncionarios.add(funcionario);
        }

        return listaFuncionarios;
    }
}
