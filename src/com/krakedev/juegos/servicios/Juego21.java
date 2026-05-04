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
            calcularTotal();
        }
    }
    public void calcularTotal() {

        for (Jugador j : jugadores) {

            int suma = 0;

            for (Carta c : j.getCartas()) {
                suma += c.getValorJuego();
            }

            j.setPuntajeCartas(suma);
        }
    }
    
    public ArrayList<Jugador> validarGanador() {

        ArrayList<Jugador> ganadores = new ArrayList<Jugador>();

        for (Jugador j : jugadores) {
            if (j.getPuntajeCartas() == 21) {
                ganadores.add(j);
            }
        }

        return ganadores;
    }
    public ArrayList<Jugador> jugar() {

        ArrayList<Jugador> ganadores = new ArrayList<Jugador>();

        for (int i = 0; i < 3; i++) {

            repartirRonda();

            ganadores = validarGanador();

            if (ganadores.size() > 0) {
                break;
            }
        }

        return ganadores;
    }
 }