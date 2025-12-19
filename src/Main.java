import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Gerente gerente= new Gerente("Joana" , "joana@email.com", "1234");
            gerente.realizarLogin("joana@email.com", "1234");
            gerente.gerarRelatorioFinanceiro();
            gerente.consultarVendas();
            gerente.realizarLogoff();


        System.out.println("-------------------------");


        Vendedor vendedor = new Vendedor("Ana", "ana@email.com", "abcd", 0);
        vendedor.realizarLogin("ana@email.com", "abcd");
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarLogoff();


        System.out.println("-------------------------");


        Atentende atentende = new Atentende("Joao", "joao@email.com" , "xyz");
        atentende.realizarLogin("joao@email.com", "xyz");
        atentende.receberPagamento(100.00);
        atentende.receberPagamento(50.00);
        atentende.fecharCaixa();
        atentende.realizarLogoff();


        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Login");
            System.out.println("2 - Gerar Relatório Financeiro");
            System.out.println("3 - Consultar Vendas");
            System.out.println("4 - Alterar Dados");
            System.out.println("5 - Alterar Senha");
            System.out.println("6 - Logoff");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o email: ");
                    String email = sc.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = sc.nextLine();
                    gerente.realizarLogin(email, senha);
                    break;

                case 2:
                    gerente.gerarRelatorioFinanceiro();
                    break;

                case 3:
                    gerente.consultarVendas();
                    break;

                case 4:
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = sc.nextLine();
                    gerente.alterarDados(novoNome, novoEmail);
                    break;

                case 5:
                    System.out.print("Senha antiga: ");
                    String senhaAntiga = sc.nextLine();
                    System.out.print("Nova senha: ");
                    String novaSenha = sc.nextLine();
                    gerente.alterarSenha(senhaAntiga, novaSenha);
                    break;

                case 6:
                    gerente.realizarLogoff();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();





    }
}