package com.example.mspedido.Dto;

public class PedidioProductoDto {

    private Integer idPedidoProducto;
    private Integer idPedido;
    private Integer idProducto;

    public PedidioProductoDto() {
    }

    public PedidioProductoDto(Integer idPedidoProducto, Integer idPedido, Integer idProducto) {
        this.idPedidoProducto = idPedidoProducto;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
    }

    public Integer getIdPedidoProducto() {
        return idPedidoProducto;
    }

    public void setIdPedidoProducto(Integer idPedidoProducto) {
        this.idPedidoProducto = idPedidoProducto;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "PedidioProductoDto{" +
                "idPedidoProducto=" + idPedidoProducto +
                ", idPedido=" + idPedido +
                ", idProducto=" + idProducto +
                '}';
    }
}
