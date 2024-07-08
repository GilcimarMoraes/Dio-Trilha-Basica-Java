public class PlanoOperadora {
    
    public static void main(String[] args) {
        
        String plano = "c";

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
            
            case "M":{
                System.out.println("Wats e Instragram grátis");
            }

            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
        
            default:{
                System.out.println("Opção Inválida");
            }
        }
    }
}
