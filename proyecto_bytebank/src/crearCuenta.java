public class crearCuenta {
    public static void main(String[] args) {
//      Variable           = Valor
        cuenta primeraCuenta = new cuenta(1);
        primeraCuenta.depositar(1000);
//      primeraCuenta.pais = "Peru"; No compila
        System.out.println(primeraCuenta.getSaldo());

        cuenta segundaCuenta = new cuenta(1);
        segundaCuenta.depositar(500);

        System.out.println(segundaCuenta.getSaldo());
        System.out.println(primeraCuenta.getAgencia());
    }
}
