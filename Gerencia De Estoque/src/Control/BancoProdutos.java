/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.Empacotamento;
import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author 02629290077
 */
public class BancoProdutos {
    private String NOMEARQUIVO = "dadosProdutos.dat";
    
    ArrayList<Object> produtos = new ArrayList<Object>();
    
    public void adicionarProduto(Produto produto){
        produtos = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        produtos.add(produto);
        Empacotamento.gravarArquivoBinario(produtos, NOMEARQUIVO);
    }
    
    public ArrayList<Produto> mostrarProdutos(){
        ArrayList<Object> listaObject = Empacotamento.lerArquivoBinario(NOMEARQUIVO);
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        
        for(Object lista: listaObject){
            Produto produto = new Produto();
            produto.setNome(((Produto)lista).getNome());
            produto.setValorCompra(((Produto)lista).getValorCompra());
            produto.setValorVenda(((Produto)lista).getValorVenda());
            produto.setQuantidade(((Produto)lista).getQuantidade());
            
            listaProdutos.add(produto);
        }
        
        return listaProdutos;
    }
}
