package com.sofka;

public class Peliculas {

    public Peliculas(String nombre, String director, Integer estreno) {

        this.nombre = nombre;
        this.director = director;
        this.estreno = estreno;
    }

    private String nombre;
    private String director;
    private Integer estreno;


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

    public Integer getEstreno() {
        return estreno;
    }

    public void setEstreno(Integer estreno) {
        this.estreno = estreno;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", estreno=" + estreno +
                '}';
    }
}
