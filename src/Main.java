import java.util.Scanner;

public class Main {
    public void main(String[] args) {


        System.out.println("bem vindo ao sistema de cadastro de pessoas físicas e jurídicas");

        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {

            System.out.println("Escolha uma opcao: 1 - Pessoa Fisica/ 2 - Pessoa Juridica / 0 - Sair");
            opcao = leitor.nextLine();



        } while (!opcao.equals("0"));
    }
}