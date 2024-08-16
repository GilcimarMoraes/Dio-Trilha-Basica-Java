package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Alunos alunosParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos aluno : alunosSet) {
                if (aluno.getMatricula() == matricula) {
                    alunosParaRemover = aluno;
                    break;
                }
            }
            alunosSet.remove(alunosParaRemover);
        } else {
            System.out.println("Lista está vazia!");
        }
        if (alunosParaRemover != null) {
            System.out.println("Aluno nao encontrado!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosPorNome.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()) {
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public void exibirAlunos() {
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosSet);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Aluno3", 1000000, 5.0);
        gerenciador.adicionarAluno("Aluno1", 2000000, 8.0);
        gerenciador.adicionarAluno("Aluno2", 3000000, 3.0);
        gerenciador.adicionarAluno("Aluno4", 4000000, 10.0);

        gerenciador.exibirAlunosPorNome();

        gerenciador.exibirAlunosPorNota();

        gerenciador.exibirAlunos();
    }

}
