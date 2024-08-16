package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastrarProdutos {
    private Set<Produto> produtosSet;

    public CadastrarProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtosSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorpreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorpreco.addAll(produtosSet);
        return produtosPorpreco;
    }

    public static void main(String[] args) {
        CadastrarProdutos cadastrarProdutos = new CadastrarProdutos();

        cadastrarProdutos.adicionarProduto("Produto 5", 1L, 15d, 5);
        cadastrarProdutos.adicionarProduto("Produto 0", 2L, 20d, 10);
        cadastrarProdutos.adicionarProduto("Produto 3", 1L, 10d, 2);
        cadastrarProdutos.adicionarProduto("Produto 9", 9L, 2d, 2);

        System.out.println(cadastrarProdutos.produtosSet);

        System.out.println(cadastrarProdutos.exibirProdutosPorNome());

        System.out.println(cadastrarProdutos.exibirProdutosPorPreco());
    }
}
