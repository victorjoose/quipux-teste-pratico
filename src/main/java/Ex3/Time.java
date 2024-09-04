package Ex3;

import java.util.*;

class Time {
    private String nomeEquipe;
    private String estadioEquipe;
    private int numeroTitulos;
    private List<Jogador> titulares;
    private List<Jogador> substitutos;

    public Time(String nomeEquipe, String estadioEquipe, int numeroTitulos,
                List<Jogador> titulares, List<Jogador> substitutos) {
        this.nomeEquipe = nomeEquipe;
        this.estadioEquipe = estadioEquipe;
        this.numeroTitulos = numeroTitulos;
        this.titulares = titulares;
        this.substitutos = substitutos;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public String getEstadioEquipe() {
        return estadioEquipe;
    }

    public int getNumeroTitulos() {
        return numeroTitulos;
    }

    public List<Jogador> getTitulares() {
        return titulares;
    }

    public List<Jogador> getSubstitutos() {
        return substitutos;
    }

    public int getNumeroTotalJogadores() {
        return titulares.size() + substitutos.size();
    }
}
