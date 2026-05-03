package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Dealer dealer;
    
    public void inicializar() {
        dealer = new Dealer();
        cargarValores();
    }
    
    public void cargarValores() {

        for (Carta c : dealer.getNaipe()) {

            String v = c.getValor();

            if (v.equals("A")) {
                c.setValorJuego(11);
            } else if (v.equals("J") || v.equals("Q") || v.equals("K")) {
                c.setValorJuego(10);
            } else {
                c.setValorJuego(Integer.parseInt(v));
            }
        }
    }
    
    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }
    
    public void repartirCarta(Jugador j) {
        Carta c = dealer.entregarCarta();
        j.recibirCarta(c);
    }
    
    public void repartirRonda() {

        for (Jugador j : jugadores) {
            repartirCarta(j);
        }
    }
 }