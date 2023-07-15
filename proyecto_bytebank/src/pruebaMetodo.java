public class pruebaMetodo {

    public static void main(String[] args) {
        cuenta cuentaJorge = new cuenta(1);
        cuentaJorge.depositar(300);
        cuentaJorge.depositar(200);
        System.out.println(cuentaJorge.getSaldo());

        cuentaJorge.retirar(100);
        System.out.println(cuentaJorge.getSaldo());

        cuenta cuentaValeria = new cuenta(1);
        cuentaValeria.depositar(1000);
        cuentaValeria.transferir(400, cuentaJorge);
        boolean puedetransferir = cuentaValeria.transferir(400,cuentaJorge);

        if(puedetransferir){
            System.out.println("Transferencia exitosa!");
        } else {
            System.out.println("Transferencia no escitosa :(");
        }

        System.out.println(cuentaValeria.getSaldo());
        System.out.println(cuentaJorge.getSaldo());
    }
}