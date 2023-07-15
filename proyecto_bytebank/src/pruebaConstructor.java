public class pruebaConstructor {
    public static void main(String[] args) {
        cuenta cuenta = new cuenta(555);
        cuenta cuenta2 = new cuenta(444);

        System.out.println(cuenta.getTotal());
    }
}
