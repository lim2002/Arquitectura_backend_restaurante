package com.example.msmenu.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tipo_producto")
@NamedQueries({
        @NamedQuery(name = "TipoProducto.findAll", query = "SELECT tp FROM TipoProducto tp"),
        @NamedQuery(name = "TipoProducto.findById", query = "SELECT tp FROM TipoProducto tp WHERE tp.idTipoProducto = :idTipoProducto")
})
public class TipoProducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_producto")
    private Integer idTipoProducto;
    @Basic(optional = false)
    @Column(name = "tipo_producto_tipo")
    private String tipoProductoTipo;
    @Basic(optional = false)
    @Column(name = "tipo_producto_activo")
    private boolean tipoProductoActivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoProducto", fetch = FetchType.LAZY)
    private List<Producto> productoList;

    public TipoProducto() {
    }

    public TipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public TipoProducto(Integer idTipoProducto, String tipoProductoTipo, boolean tipoProductoActivo) {
        this.idTipoProducto = idTipoProducto;
        this.tipoProductoTipo = tipoProductoTipo;
        this.tipoProductoActivo = tipoProductoActivo;
    }

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getTipoProductoTipo() {
        return tipoProductoTipo;
    }

    public void setTipoProductoTipo(String tipoProductoTipo) {
        this.tipoProductoTipo = tipoProductoTipo;
    }

    public boolean isTipoProductoActivo() {
        return tipoProductoActivo;
    }

    public void setTipoProductoActivo(boolean tipoProductoActivo) {
        this.tipoProductoActivo = tipoProductoActivo;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public String toString() {
        return "TipoProducto{" +
                "idTipoProducto=" + idTipoProducto +
                ", tipoProductoTipo='" + tipoProductoTipo + '\'' +
                ", tipoProductoActivo=" + tipoProductoActivo +
                ", productoList=" + productoList +
                '}';
    }
}






