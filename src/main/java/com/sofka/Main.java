package com.sofka;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Peliculas> setPeliculas = new HashSet<>();

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese Nombre, director y año de extreno de la pelicula " + i );
            setPeliculas.add(new Peliculas(entrada.next(), entrada.next(), entrada.nextInt()));
        }

        System.out.println("Lista de peliculas: " + "\n");

        for (Peliculas peliculas : setPeliculas) {
            System.out.println("Nombre: " + peliculas.getNombre() +
                    "\nDirector: " + peliculas.getDirector() +
                    "\nAño de extreno : " + peliculas.getExtreno() +
                    "\n");
        }
    }
}