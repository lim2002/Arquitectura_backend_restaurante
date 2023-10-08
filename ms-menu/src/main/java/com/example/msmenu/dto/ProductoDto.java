package com.example.msmenu.dto;

public class ProductoDto {
    private int idProducto;
    private String productoNombre;
    private String productoDescripcion;
    private double productoPrecio;
    private String productoFoto;

    public ProductoDto() {
    }

    public ProductoDto(int idProducto, String productoNombre, String productoDescripcion, double productoPrecio, String productoFoto) {
        this.idProducto = idProducto;
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoPrecio = productoPrecio;
        this.productoFoto = productoFoto;
    }

    public ProductoDto(ProductoDto productoDto){
        this.idProducto = productoDto.getIdProducto();
        this.productoNombre = productoDto.getProductoNombre();
        this.productoDescripcion = productoDto.getProductoDescripcion();
        this.productoPrecio = productoDto.getProductoPrecio();
        this.productoFoto = productoDto.getProductoFoto();
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public String getProductoFoto() {
        return productoFoto;
    }

    public void setProductoFoto(String productoFoto) {
        this.productoFoto = productoFoto;
    }

    @Override
    public String toString() {
        return "ProductoDto{" +
                "idProducto=" + idProducto +
                ", productoNombre='" + productoNombre + '\'' +
                ", productoDescripcion='" + productoDescripcion + '\'' +
                ", productoPrecio=" + productoPrecio +
                ", productoFoto='" + productoFoto + '\'' +
                '}';
    }
}
