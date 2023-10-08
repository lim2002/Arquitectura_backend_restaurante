package com.example.msmenu.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "categoria")
@NamedQueries({
        @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c"),
        @NamedQuery(name = "Categoria.findById", query = "SELECT c FROM Categoria c WHERE c.idCategoria = :idCategoria")
})
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic (optional = false)
    @Column (name = "id_categoria")
    private Integer idCategoria;
    @Basic (optional = false)
    @Column (name = "categoria_nombre")
    private String categoriaNombre;
    @Basic (optional = false)
    @Column (name = "categoria_activo")
    private boolean categoriaActivo;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "idCategoria", fetch = FetchType.LAZY)
    private List<Plato> platoList;
    public Categoria() {
    }

    public Categoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Categoria(Integer idCategoria, String categoriaNombre, boolean categoriaActivo, List<Plato> platoList) {
        this.idCategoria = idCategoria;
        this.categoriaNombre = categoriaNombre;
        this.categoriaActivo = categoriaActivo;
        this.platoList = platoList;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public void setCategoriaNombre(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }

    public boolean isCategoriaActivo() {
        return categoriaActivo;
    }

    public void setCategoriaActivo(boolean categoriaActivo) {
        this.categoriaActivo = categoriaActivo;
    }

    public List<Plato> getPlatoList() {
        return platoList;
    }

    public void setPlatoList(List<Plato> platoList) {
        this.platoList = platoList;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", categoriaNombre='" + categoriaNombre + '\'' +
                ", categoriaActivo=" + categoriaActivo +
                ", platoList=" + platoList +
                '}';
    }
}
