// 3. Desenvolva um programa que permita inserir as seguintes informações sobre um time de futboll: 

// -Nome da equipe 
// -Estádio da equipe 
// -Número de títulos 
// -Lista de jogadores titulares (cada um com nome e posição) -Lista de jogadores substitutos (cada um com nome e posição) 
// Após inserir as informações, o programa deverá dar a opção de gerar alguns destes relatórios: 
// 1. Relatório básico (Nome do time, títulos conquistados e número total de jogadores) 
// 2. Relatório detalhado (nome da equipe, lista com detalhes de todos os titulares e substitutos) 
// Ao selecionar a opção desejada, o programa deverá imprimir as informações solicitadas em cada relatório. 
// Nota: O exercício deve ser realizado com programação orientada a objetos. Nenhuma interface gráfica necessária.
package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = criarTime(scanner);

        Relatorio relatorio = new Relatorio();
        boolean continuar = true;

        while (continuar) {
            int escolha = escolherRelatorio(scanner);
            gerarRelatorio(relatorio, time, escolha);

            System.out.print("Deseja gerar outro relatório? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        scanner.close();
    }

    private static Time criarTime(Scanner scanner) {
        System.out.print("Nome da equipe: ");
        String nomeEquipe = scanner.nextLine();

        System.out.print("\nEstádio da equipe: ");
        String estadioEquipe = scanner.nextLine();

        System.out.print("\nNúmero de títulos: ");
        int numeroTitulos = scanner.nextInt();
        scanner.nextLine();

        List<Jogador> titulares = criarListaJogadores(scanner, "titulares");
        List<Jogador> reservas = criarListaJogadores(scanner, "reservas");

        return new Time(nomeEquipe, estadioEquipe, numeroTitulos, titulares, reservas);
    }

    private static List<Jogador> criarListaJogadores(Scanner scanner, String tipo) {
        List<Jogador> jogadores = new ArrayList<Jogador>();
        System.out.println("\nDigite os jogadores " + tipo + " (nome e posição). Digite 'fim' para encerrar.");
        while (true) {
            System.out.print("\nNome do jogador: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("\nPosição do jogador: ");
            String posicao = scanner.nextLine();
            if (posicao.equalsIgnoreCase("fim")) {
                break;
            }
            jogadores.add(new Jogador(nome, posicao));
        }
        return jogadores;
    }

    private static int escolherRelatorio(Scanner scanner) {
        System.out.println("\nEscolha o tipo de relatório:");
        System.out.println("1. Relatório básico");
        System.out.println("2. Relatório detalhado");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        return escolha;
    }

    private static void gerarRelatorio(Relatorio relatorio, Time time, int escolha) {
        switch (escolha) {
            case 1:
                relatorio.gerarRelatorioBasico(time);
                break;
            case 2:
                relatorio.gerarRelatorioDetalhado(time);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
