class cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private cliente titular = new cliente();
    private static int total = 0;
    public cuenta(int agencia){
        if (agencia <= 0){
            System.out.println("No se permiten 0");
            this.agencia = 1;

        } else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando " + total + " cuentas");
    }

    //No retorna valor
    public void depositar(double valor) {

        this.saldo += valor;

    }

    //Retorna valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    //Retorna valor
    public boolean transferir(double valor, cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return cuenta.total;
    }
}