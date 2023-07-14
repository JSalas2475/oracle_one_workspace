public class pruebaMetodo {

    public static void main(String[] args) {
        cuenta cuentaJorge = new cuenta();
        cuentaJorge.saldo = 300;
        cuentaJorge.depositar(200);
        System.out.println(cuentaJorge.saldo);

        cuentaJorge.retirar(100);
        System.out.println(cuentaJorge.saldo);

        cuenta cuentaValeria = new cuenta();
        cuentaValeria.depositar(1000);
        cuentaValeria.transferir(400, cuentaJorge);
        boolean puedetransferir = cuentaValeria.transferir(400,cuentaJorge);

        if(puedetransferir){
            System.out.println("Transferencia exitosa!");
        } else {
            System.out.println("Transferencia no escitosa :(");
        }

        System.out.println(cuentaValeria.saldo);
        System.out.println(cuentaJorge.saldo);
    }
}