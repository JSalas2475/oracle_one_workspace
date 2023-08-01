public class SistemaInterno {

    private String clave = "mlp";

    public boolean autentica(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("Puede inicair sesion");
            return true;
        } else {
            System.out.println("Error en Log In");
            return false;
        }
    }

}
