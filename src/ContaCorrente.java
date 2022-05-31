public class ContaCorrente extends Conta{
    @Override
    public void criarConta(int idade, boolean trabalho) {
        if (idade > 18 && trabalho == true){
            super.criarConta();
            System.out.println("Conta criada");
        }else{
            System.out.println("Não é possíve criar uma conta, pois não tem a idade o suficiente e não está empregado");
        }

    }
}
