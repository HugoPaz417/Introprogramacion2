public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE OPERADORES LÓGICOS O BOOLEANOS");
        boolean valor = (5 == 5);//Operador relacional
        boolean valor_logico = ( (5==5) || (4<=3) );//V or V ->V
        boolean valor_logico_and = ( (5==5) && (4>=3) );//V and V ->V
        System.out.println("valor"+valor);
        System.out.println("valor_logico: "+valor_logico);
        System.out.println("valor_logico_and"+valor_logico_and);
        System.out.println("Negacion de valor_logico: "+ !valor_logico);

    }
}