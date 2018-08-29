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
    
    public ArrayList<Object> mostrarProdutos(){
        return Empacotamento.lerArquivoBinario(NOMEARQUIVO);
    }
}
