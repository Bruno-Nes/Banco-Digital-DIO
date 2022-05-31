public class ContaPoupança extends Conta{

    private Cliente cliente;

    public ContaPoupança(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void criarConta(int idade, boolean trabalho) {
        if (idade > 13) {
            super.criarConta();
        }else {
            System.out.println("Impossivel criar conta, pois não tem a idade o suficiente");
        }
    }
}
