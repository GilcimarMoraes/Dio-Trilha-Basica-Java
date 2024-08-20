package main.java.map.OperacoesBasicas;

import main.java.set.Pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroporNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroporNome = agendaContatosMap.get(nome);
        }
        return numeroporNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 1);
        agendaContatos.adicionarContato("Paulo", 2);
        agendaContatos.adicionarContato("Maria", 3);
        agendaContatos.adicionarContato("Joao", 4);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Joao");
        agendaContatos.exibirContatos();

        System.out.printf("O numero é: " + agendaContatos.pesquisarPorNome("Paulo"));
    }
}
