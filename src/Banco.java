public abstract class Banco {
    private String nome;
    abstract double saldoConta();
    abstract void sacar(double valor);

    abstract void depositar(double valor);

    abstract void transferir(double valor, Conta conta);
}
