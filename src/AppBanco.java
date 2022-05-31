import java.util.Scanner;

public class AppBanco {
    //Classe onde sera criado e gerenciado as contas
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Bruno", "Nestor", 20);
        cliente1.setTrabalho(true);
        Conta cc = new ContaCorrente();
        cc.criarConta(cliente1.getIdade(), cliente1.isTrabalho());
        menu();
//        boolean showMenu = true;
//        while(showMenu) {
//            System.out.println("Escolha um opcao: ");
//            int numeroDigitado = scan.nextInt();
//
//        }
    }
    public static void menu() {
        System.out.println("O que voce deseja fazer?");
        System.out.println("Digite 1 para criar uma conta");
        System.out.println("Digite 2 para depositar");
        System.out.println("Digite 3 para sacar ");
        System.out.println("Digite 0 para sair do programa");
    }
}
