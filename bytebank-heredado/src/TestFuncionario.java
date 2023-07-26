public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario jorge = new Contador();
        jorge.setNombre("Jorge");
        jorge.setDocumento("444556665");
        jorge.setSalario(2000);
        jorge.setTipo(0);

        System.out.println(jorge.getSalario());
        System.out.println(jorge.getBonificacion());
    }

}
