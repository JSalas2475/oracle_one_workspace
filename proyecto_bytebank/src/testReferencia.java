public class testReferencia {
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta(1);
        primeraCuenta.depositar(200);

        cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.depositar(100);
        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());
        System.out.println("Saldo segunda cuenta: " + segundaCuenta.getSaldo());

        segundaCuenta.depositar(400);
        System.out.println("Saldo primera cuenta: " + primeraCuenta.getSaldo());

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if (primeraCuenta == segundaCuenta){
            System.out.println(" Son iguales");
        }else {
            System.out.println("No son iguales");
        }
    }
}