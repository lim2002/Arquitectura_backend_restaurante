package com.example.msmenu.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "producto")
@NamedQueries({
        @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
        @NamedQuery(name = "Producto.findById", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto"),
        @NamedQuery(name = "Producto.findByProducto", query = "SELECT p FROM Producto p WHERE p.producto = :producto")
})
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional=false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional=false)
    @Column(name = "producto_photo")
    private String productoPhoto;
    @Basic(optional=false)
    @Column(name = "producto_nombre")
    private String productoNombre;
    @Basic(optional=false)
    @Column(name = "producto_descripcion")
    private String productoDescripcion;
    @Basic(optional=false)
    @Column(name = "producto_precio")
    private double productoPrecio;
    @Basic(optional=false)
    @Column(name = "producto_activo")
    private boolean productoActivo;
    @JoinColumn(name = "id_tipo_producto", referencedColumnName = "id_tipo_producto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoProducto idTipoProducto;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String productoPhoto, String productoNombre, String productoDescripcion, double productoPrecio, boolean productoActivo) {
        this.idProducto = idProducto;
        this.productoPhoto = productoPhoto;
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoPrecio = productoPrecio;
        this.productoActivo = productoActivo;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getProductoPhoto() {
        return productoPhoto;
    }

    public void setProductoPhoto(String productoPhoto) {
        this.productoPhoto = productoPhoto;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    public double getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(double productoPrecio) {
        this.productoPrecio = productoPrecio;
    }

    public boolean isProductoActivo() {
        return productoActivo;
    }

    public void setProductoActivo(boolean productoActivo) {
        this.productoActivo = productoActivo;
    }

    public TipoProducto getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(TipoProducto idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", productoPhoto='" + productoPhoto + '\'' +
                ", productoNombre='" + productoNombre + '\'' +
                ", productoDescripcion='" + productoDescripcion + '\'' +
                ", productoPrecio=" + productoPrecio +
                ", productoActivo=" + productoActivo +
                ", idTipoProducto=" + idTipoProducto +
                '}';
    }
}
