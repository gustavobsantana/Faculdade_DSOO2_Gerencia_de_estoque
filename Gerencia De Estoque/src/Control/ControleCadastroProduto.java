/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author 02629290077
 */
public class ControleCadastroProduto {

    public void cadastroProduto(String nome, String valorCompra, String valorVenda, String quantidade) {
        Produto produto = new Produto();

        produto.setNome(nome);
        produto.setValorCompra(Double.parseDouble(valorCompra));
        produto.setValorVenda(Double.parseDouble(valorVenda));
        produto.setQuantidade(Integer.parseInt(quantidade));
        
        new BancoProdutos().adicionarProduto(produto);
        
    }
    
    public void mostrarProdutos(){
        ArrayList<Object> list = new BancoProdutos().mostrarProdutos();
        for (Object object : list) {
            System.out.println(((Produto)object).getNome());
        }
    }
}
