package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		/*
		 * Juego21 juego = new Juego21();
		 * 
		 * Jugador j1 = new Jugador(); j1.setNickname("J1");
		 * 
		 * Jugador j2 = new Jugador(); j2.setNickname("J2");
		 * 
		 * Jugador j3 = new Jugador(); j3.setNickname("J3");
		 * 
		 * juego.agregarJugador(j1); juego.agregarJugador(j2); juego.agregarJugador(j3);
		 * 
		 * juego.inicializar();
		 * 
		 * juego.repartirRonda();
		 * 
		 * j1.imprimir(); j2.imprimir(); j3.imprimir();
		 * 
		 * ArrayList<Jugador> ganadores = juego.jugar();
		 * 
		 * for (Jugador j : ganadores) { j.imprimir(); }
		 * 
		 	}
*/
	// =========================
	// 🔹 PRIMERA PRUEBA
	// =========================
	System.out.println("=== PRIMERA PRUEBA ===");

	Juego21 juego1 = new Juego21();

	Jugador j1 = new Jugador();j1.setNickname("J1");

	Jugador j2 = new Jugador();j2.setNickname("J2");

	Jugador j3 = new Jugador();j3.setNickname("J3");

	juego1.agregarJugador(j1);juego1.agregarJugador(j2);juego1.agregarJugador(j3);

	juego1.inicializar();

	ArrayList<Jugador> ganadores1 = juego1.jugar();

	System.out.println("Ganadores:");

	for( Jugador j:ganadores1)
	{
		j.imprimir();
	}

	// =========================
	// 🔹 SEGUNDA PRUEBA
	// =========================
	System.out.println("\n=== SEGUNDA PRUEBA (10 INTENTOS) ===");

	for( int i = 0;i<10;i++){
        System.out.println("\nIntento #" + (i + 1));

        Juego21 juego = new Juego21();

        Jugador a = new Jugador();
        a.setNickname("A");

        Jugador b = new Jugador();
        b.setNickname("B");

        Jugador c = new Jugador();
        c.setNickname("C");

        juego.agregarJugador(a);
        juego.agregarJugador(b);
        juego.agregarJugador(c);

        juego.inicializar();

        ArrayList<Jugador> ganadores = juego.jugar();

        if (ganadores.size() == 0) {
            System.out.println("No hubo ganador");
        } else {
            System.out.println("Ganadores:");
            for (Jugador j : ganadores) {
                j.imprimir();
            }
        }
    	}
	}

}