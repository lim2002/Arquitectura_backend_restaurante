package com.example.mspedido.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido_producto")
public class PedidoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido_producto", nullable = false)
    private Integer idPedidoProducto;

    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    public PedidoProducto() {
    }

    public PedidoProducto(Integer idPedidoProducto, Integer idPedido, Integer idProducto) {
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
        return "PedidioProducto{" +
                "idPedidoProducto=" + idPedidoProducto +
                ", idPedido=" + idPedido +
                ", idProducto=" + idProducto +
                '}';
    }
}
