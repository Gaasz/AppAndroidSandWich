package com.example.supersandwich;

public class Modelo {

    private String nombre;
    private String precio;
    private String descripcion;
    private int image;

    public Modelo(String nombre, String precio, String descripcion, int image) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImage() {
        return image;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
