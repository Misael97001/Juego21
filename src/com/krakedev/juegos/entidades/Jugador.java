package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {

    private String nickname;
    private ArrayList<Carta> cartas = new ArrayList<Carta>();

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void recibirCarta(Carta c) {
        cartas.add(c);
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void imprimir() {

        System.out.println("Jugador: " + nickname);

        for (Carta c : cartas) {
            c.imprimir();
        }
    }
    
    private int puntajeCartas;

    public int getPuntajeCartas() {
        return puntajeCartas;
    }

    public void setPuntajeCartas(int puntajeCartas) {
        this.puntajeCartas = puntajeCartas;
    }
}