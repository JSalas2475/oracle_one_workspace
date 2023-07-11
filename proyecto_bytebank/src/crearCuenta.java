public class crearCuenta {
    public static void main(String[] args) {
//      Variable           = Valor
        cuenta primeraCuenta = new cuenta();
        primeraCuenta.saldo = 1000;
//      primeraCuenta.pais = "Peru"; No compila
        System.out.println(primeraCuenta.saldo);

        cuenta segundaCuenta = new cuenta();
        segundaCuenta.saldo = 500;

        System.out.println(segundaCuenta.saldo);
        System.out.println(primeraCuenta.agencia);
    }
}
