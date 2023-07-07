public class ejemploCondicionales2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int edad = 18;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        System.out.println("El valor de la condicion es: " + esPareja);

        if (puedeEntrar) {
            System.out.println("Usted puede entrar");
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usted no puede entrar");
        }
    }
}
