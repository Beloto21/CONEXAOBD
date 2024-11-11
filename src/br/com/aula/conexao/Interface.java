package br.com.aula.conexao;

import java.util.Scanner;

public class Interface {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean rodando = true;

	        while (rodando) {
	            exibirMenu();
	            int opcao;
	            try {
	            	// aqui é para ler como String e converter eles para inteiros
	                opcao = Integer.parseInt(scanner.nextLine()); 
	            } catch (NumberFormatException e) {
	                System.out.println("Entrada inválida. Por favor, insira um número.");
	                continue;
	            }

	            switch (opcao) {
	                case 1:
	                    InserirDados.inserirAluno(scanner);
	                    break;
	                case 2:
	                    LerDados.lerAlunos();
	                    break;
	                case 3:
	                    AtualizarDados.atualizarAluno(scanner);
	                    break;
	                case 4:
	                    DeletarDados.deletarAluno(scanner);
	                    break;
	                case 5:
	                    System.out.println("Saindo!");
	                    rodando = false;
	                    break;
	                default:
	                    System.out.println("Opção inválida foi invalida. Tente novamente.");
	            }
	        }

	        scanner.close();
	    }

	    private static void exibirMenu() {
	        System.out.println("\n===== Menu Principal =====");
	        System.out.println("1. Inserir Aluno");
	        System.out.println("2. Ler Registro de Alunos");
	        System.out.println("3. Atualizar Aluno");
	        System.out.println("4. Deletar Aluno");
	        System.out.println("5. Sair");
	        System.out.print("Escolha uma opção: ");
	    }
	}
	

	


