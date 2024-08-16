package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novonumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novonumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("Gilcimar", 1234);
        agenda.adicionarContato("Gilcimar", 43210);
        agenda.adicionarContato("Gilcimar Moraes", 111111);
        agenda.adicionarContato("Gilcimar DIO", 56789);
        agenda.adicionarContato("Maria", 111111);
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarContato("Maria"));

        System.out.println("Contato Atualizado: " + agenda.atualizarNumeroContato("Maria", 33333));

        agenda.exibirContatos();
    }
}
