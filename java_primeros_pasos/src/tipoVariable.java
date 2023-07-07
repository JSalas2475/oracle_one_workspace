public class tipoVariable {

    public static void main(String [] args){
        double variable1 = 230.89;
        int variable1Entero = (int) variable1; // Cast
        //Este método imprime en la consola
        System.out.println(variable1Entero);
        //Otros tipos de numeros
        long prueba = 1222222222222222222L;
        short numeroPequeno = 13555;
        byte numeroDiminuto = 123;
        float numeroDecimalPequeno = 2.5F;

        double resultado = variable1Entero + variable1;
        System.out.println(resultado);
    }

}
