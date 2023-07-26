public class TestReferencia {
    public static void main(String[] args) {

//El elemento mas generico puede ser adaptado al elemento mas especifico
        Gerente gerente = new Gerente();
        gerente.setNombre("Valeria");

        gerente.setSalario(10000);

        gerente.iniciarSesion("mlp");
    }
}
