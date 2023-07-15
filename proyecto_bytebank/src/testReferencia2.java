public class testReferencia2 {
    public static void main(String[] args) {
        cliente jorge = new cliente();

        jorge.setNombre("Jorge");
        jorge.setDocumento("0235678");
        jorge.setTelefono("8132496127");

        cuenta cuentaDeJorge = new cuenta(1);
        cuentaDeJorge.setTitular(jorge);

        System.out.println(cuentaDeJorge.getTitular().getDocumento());
        System.out.println(cuentaDeJorge.getTitular());
        System.out.println(jorge);

    }
}
