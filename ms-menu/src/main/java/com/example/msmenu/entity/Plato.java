package com.example.msmenu.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "plato")
@NamedQueries({
        @NamedQuery(name = "Plato.findAll", query = "SELECT p FROM Plato p"),
        @NamedQuery(name = "Plato.findById", query = "SELECT p FROM Plato p WHERE p.idPlato = :idPlato"),
        @NamedQuery(name = "Plato.findByPlato", query = "SELECT p FROM Plato p WHERE p.platoNombre = :plato")
})
public class Plato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic (optional = false)
    @Column (name = "id_plato")
    private Integer idPlato;
    @Basic (optional = false)
    @Column(name = "plato_nombre")
    private String platoNombre;
    @Basic (optional = false)
    @Column(name = "plato_foto")
    private String platoFoto;
    @Basic (optional = false)
    @Column(name = "plato_descripcion")
    private String platoDescripcion;
    @Basic (optional = false)
    @Column(name = "plato_precio")
    private double platoPrecio;
    @Basic (optional = false)
    @Column(name = "plato_activo")
    private boolean platoActivo;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Categoria idCategoria;
    @JoinColumn(name = "id_tipo_plato", referencedColumnName = "id_tipo_plato")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoPlato idTipoPlato;

    public Plato() {
    }

    public Plato(Integer idPlato) {
        this.idPlato = idPlato;
    }

    public Plato(Integer idPlato, String platoNombre, String platoFoto, String platoDescripcion, double platoPrecio, boolean platoActivo) {
        this.idPlato = idPlato;
        this.platoNombre = platoNombre;
        this.platoFoto = platoFoto;
        this.platoDescripcion = platoDescripcion;
        this.platoPrecio = platoPrecio;
        this.platoActivo = platoActivo;
    }

    public Integer getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(Integer idPlato) {
        this.idPlato = idPlato;
    }

    public String getPlatoNombre() {
        return platoNombre;
    }

    public void setPlatoNombre(String platoNombre) {
        this.platoNombre = platoNombre;
    }

    public String getPlatoFoto() {
        return platoFoto;
    }

    public void setPlatoFoto(String platoFoto) {
        this.platoFoto = platoFoto;
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

    public boolean isPlatoActivo() {
        return platoActivo;
    }

    public void setPlatoActivo(boolean platoActivo) {
        this.platoActivo = platoActivo;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public TipoPlato getIdTipoPlato() {
        return idTipoPlato;
    }

    public void setIdTipoPlato(TipoPlato idTipoPlato) {
        this.idTipoPlato = idTipoPlato;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "idPlato=" + idPlato +
                ", platoNombre='" + platoNombre + '\'' +
                ", platoFoto='" + platoFoto + '\'' +
                ", platoDescripcion='" + platoDescripcion + '\'' +
                ", platoPrecio=" + platoPrecio +
                ", platoActivo=" + platoActivo +
                ", idCategoria=" + idCategoria +
                ", idTipoPlato=" + idTipoPlato +
                '}';
    }
}
