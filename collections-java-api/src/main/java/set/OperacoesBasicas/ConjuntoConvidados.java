package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoPararemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoDoConvite() == codigoConvite) {
                convidadoPararemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoPararemover);
    }

    public int contarconvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Exitem" + conjuntoConvidados.contarconvidados() + " convidados dentro do Set de convidado.");


        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);

        System.out.println("Exitem" + conjuntoConvidados.contarconvidados() + " convidados dentro do Set de convidado.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Exitem" + conjuntoConvidados.contarconvidados() + " convidados dentro do Set de convidado.");

        conjuntoConvidados.exibirConvidados();
    }
}
