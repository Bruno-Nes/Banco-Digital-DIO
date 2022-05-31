public class Cliente {
    private String nome;
    private String sobrenome;
    private int idade;
    private boolean trabalho;

    public Cliente(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        //Não há necessidade de criar um construtor com trabalho pois o cliente não precisa estar trabalhando para ter uma conta poupança
    }

    public void setTrabalho(boolean trabalho) {
        this.trabalho = trabalho;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isTrabalho() {
        return trabalho;
    }
}
