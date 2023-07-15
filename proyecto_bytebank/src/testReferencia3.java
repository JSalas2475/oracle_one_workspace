public class testReferencia3 {
    public static void main(String[] args) {
        cuenta cuentaDeJorge = new cuenta(1);

//        cliente cliente = new cliente();
//        cuentaDeJorge.titular = cliente;
//        cuentaDeJorge.titular = new cliente();
//        cuentaDeJorge.titular.nombre = "Jorge";
        System.out.println(cuentaDeJorge.getTitular().getNombre());
    }
}
