public class pruebaEncapsulamiento {
    public static void main(String[] args) {
        cuenta cuenta = new cuenta(1);
        cliente cliente =new cliente();
        cliente.setNombre("jorge");
        cliente.setDocumento("01232475");

        cuenta.setTitular(cliente);

        cliente titular = cuenta.getTitular();

        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
        System.out.println(titular);
    }
}
