package br.com.aula.conexao;

import java.util.Scanner;

// classe dp MenuPrincipal
public class Interface {

    public static void main(String[] args) {
    	
        // aqui vai criar o scanner para que possa ler 
        Scanner scanner = new Scanner(System.in);
        
        boolean rodando = true;

        // aqui vai ser o loop que vai rodar paraque o usuário possa escolher sair
        while (rodando) {
            // aqui vai chamar a função 
            exibirMenu();
            int opcao;
            try {
                // aqui vai tentar ler a opção como número se for inteiro
                opcao = Integer.parseInt(scanner.nextLine()); 
            } catch (NumberFormatException e) {
                // caso o usuario não digitar numero, vai dar erro
                System.out.println("Entrada inválida. Por favor, insira um número.");
                continue;
            }
            // vai escolher a ação para que ele faça
            switch (opcao) {
                case 1:
                    // aqui vai chamar o metodo para que possa inserir os dados
                    InserirDados.inserirAluno(scanner);
                    break;
                case 2:
                    // aqui vai chamar o metodo para ler os dados
                    LerDados.lerAlunos();
                    break;
                case 3:
                    // aqui vai chamar o metodo para atualizar os dados
                    AtualizarDados.atualizarAluno(scanner);
                    break;
                case 4:
                    // aqui vai chamar o metodo para deletar os dados
                    DeletarDados.deletarAluno(scanner);
                    break;
                case 5:
                    // aqui é para sair do programa
                    System.out.println("Saindo do sistema. Até logo!");
                    rodando = false;
                    break;
                default:
                    // caso a opcao nao seja valida, vai aparecer que deu erro
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
        
        // aqui é para fechar o scanner
        scanner.close();
    }

    // metodo para exibir o menu para o usuario
    private static void exibirMenu() {
        System.out.println("\n===== Menu Principal =====");
        System.out.println("1. Inserir Dados");
        System.out.println("2. Ler Dados");
        System.out.println("3. Atualizar Dados");
        System.out.println("4. Deletar Dados");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }
}