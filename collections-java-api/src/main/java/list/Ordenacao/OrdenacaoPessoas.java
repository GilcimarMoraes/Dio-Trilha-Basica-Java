package main.java.list.Ordenacao;

import java.util.*;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaslist;

    public OrdenacaoPessoas() {
        this.pessoaslist = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaslist.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaslist);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>();
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacao.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacao.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacao.adicionarPessoa("Nome 4", 14, 1.50);

        System.out.println(ordenacao.ordenarPorAltura());


    }
}
