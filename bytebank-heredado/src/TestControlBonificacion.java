public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario jorge = new Contador();
        jorge.setSalario(2000);

        Gerente Valeria = new Gerente();
        Valeria.setSalario(6000);

        Contador carlos = new Contador();
        carlos.setSalario(4000);


        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(jorge);
        controlBonificacion.registrarSalario(Valeria);
        controlBonificacion.registrarSalario(carlos);

    }
}
