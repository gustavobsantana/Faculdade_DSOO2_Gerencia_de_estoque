/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.MenuPrincipal;

/**
 *
 * @author Gustavo Santana
 */
public class ControleMenuPrincipal {

    MenuPrincipal view = new MenuPrincipal(this);
    
    public void iniciarMenuPrincipalFuncionario(){
        view.getBtCadastrarFuncionario().setVisible(false);
        view.getBtListarFuncionarios().setVisible(false);
        view.setVisible(true);
    }
  
    public void iniciarMenuPrincipalAdmin(){
        view.setVisible(true);
    }

    public void cadastrarCliente() {
        new ControleCadastroCliente().iniciarCadastroCliente();
    }
    
    public void cadastrarFuncionario(){
        new ControleCadastroFuncionario().iniciarCadastroFuncionario();
    }
    
    public void cadastrarProduto(){
        new ControleCadastroProduto().iniciarCadastroProduto();
    }
    
    public void listarFuncionarios(){
        new ControleLista().iniciarListaFuncionarios();
    }
    
    public void listarClientes(){
        new ControleLista().iniciarListaClientes();
    }
    
    public void listarProdutos(){
        new ControleLista().iniciarListaProdutos();
    }
    
}
