package com.example.msmenu.dto;

public class PlatoDto {
    private int idPlato;
    private String platoNombre;
    private String platoDescripcion;
    private double platoPrecio;
    private String platoFoto;

    public PlatoDto() {
    }

    public PlatoDto(int idPlato, String platoNombre, String platoDescripcion, double platoPrecio, String platoFoto) {
        this.idPlato = idPlato;
        this.platoNombre = platoNombre;
        this.platoDescripcion = platoDescripcion;
        this.platoPrecio = platoPrecio;
        this.platoFoto = platoFoto;
    }

    public PlatoDto(PlatoDto platoDto){
        this.idPlato = platoDto.getIdPlato();
        this.platoNombre = platoDto.getPlatoNombre();
        this.platoDescripcion = platoDto.getPlatoDescripcion();
        this.platoPrecio = platoDto.getPlatoPrecio();
        this.platoFoto = platoDto.getPlatoFoto();
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getPlatoNombre() {
        return platoNombre;
    }

    public void setPlatoNombre(String platoNombre) {
        this.platoNombre = platoNombre;
    }

    public String getPlatoDescripcion() {
        return platoDescripcion;
    }

    public void setPlatoDescripcion(String platoDescripcion) {
        this.platoDescripcion = platoDescripcion;
    }

    public double getPlatoPrecio() {
        return platoPrecio;
    }

    public void setPlatoPrecio(double platoPrecio) {
        this.platoPrecio = platoPrecio;
    }

    public String getPlatoFoto() {
        return platoFoto;
    }

    public void setPlatoFoto(String platoFoto) {
        this.platoFoto = platoFoto;
    }

    @Override
    public String toString() {
        return "PlatoDto{" +
                "idPlato=" + idPlato +
                ", platoNombre='" + platoNombre + '\'' +
                ", platoDescripcion='" + platoDescripcion + '\'' +
                ", platoPrecio=" + platoPrecio +
                ", platoFoto='" + platoFoto + '\'' +
                '}';
    }
}

