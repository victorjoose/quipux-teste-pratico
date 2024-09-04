package Ex3;

class Relatorio {
    public void gerarRelatorioBasico(Time time) {
        System.out.println("\nRelatório Básico:");
        System.out.println("Nome da equipe: " + time.getNomeEquipe());
        System.out.println("Número de títulos: " + time.getNumeroTitulos());
        System.out.println("Número total de jogadores: " + time.getNumeroTotalJogadores());
    }

    public void gerarRelatorioDetalhado(Time time) {
        System.out.println("\nRelatório Detalhado:");
        System.out.println("Nome da equipe: " + time.getNomeEquipe());
        System.out.println("Estádio: " + time.getEstadioEquipe());
        System.out.println("Número de títulos: " + time.getNumeroTitulos());

        System.out.println("\nTitulares:");
        for (Jogador jogador : time.getTitulares()) {
            System.out.println(jogador);
        }

        System.out.println("\nReservas:");
        for (Jogador jogador : time.getSubstitutos()) {
            System.out.println(jogador);
        }
    }
}