public abstract class Conta extends Banco{
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public void criarConta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero =  SEQUENCIAL++;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }


    @Override
    void sacar(double valor) {
        double valorSaque;
        if (this.saldo == 0.0){
            System.out.println("Impossivel sacar, saldo inexistente");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para o saque");
        }else {
            valorSaque = this.saldo - valor;
            setSaldo(valorSaque);
        }
    }


    @Override
    public double saldoConta() {
        return getSaldo();
    }

    @Override
    void transferir(double valor, Conta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    public abstract void criarConta(int idade, boolean trabalho);
}
