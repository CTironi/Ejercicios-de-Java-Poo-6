package com.sofka;

public class Peliculas {

    public Peliculas(String nombre, String director, Integer extreno){

        this.nombre = nombre;
        this.director = director;
        this.extreno = extreno;
    }

    private String nombre;
    private String director;
    private Integer extreno;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getExtreno() {
        return extreno;
    }

    public void setExtreno(Integer extreno) {
        this.extreno = extreno;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", extreno=" + extreno +
                '}';
    }
}
