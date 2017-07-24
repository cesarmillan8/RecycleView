package com.millancode.mascotas;

public class Mascota {
    int nMascota;
    String nombre;

    public Mascota(int nMascota, String nombre) {
        this.nMascota = nMascota;
        this.nombre = nombre;
    }

    public int getnMascota() {
        return nMascota;
    }

    public void setnMascota(int nMascota) {
        this.nMascota = nMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}