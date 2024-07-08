public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 3;

       if(nota >= 7)
            System.out.println("aprovado");

        else if(nota >= 5 && nota < 7)
            System.out.println("Prova de recuperação");

        else
            System.out.println("reprovado"); 


        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
