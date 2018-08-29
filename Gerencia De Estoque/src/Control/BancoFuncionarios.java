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
    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        funcionarios.add(funcionario);
        Empacotamento.gravarArquivoBinario(funcionarios, NOMEARQUIVO);
    }
    
    public ArrayList<Object> mostrarFuncionarios(){
        return Empacotamento.lerArquivoBinario(NOMEARQUIVO);
    }
}
