public class pruebaAcceso {

    public static void main(String[] args) {
        cuenta cuenta = new cuenta(1);
        cuenta.depositar(400);
        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());
    }

}
