package com.example.mspedido.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido_plato")
public class PedidoPlato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido_plato", nullable = false)
    private Integer idPedidoPlato;

    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "id_plato", nullable = false)
    private Integer idPlato;

    public PedidoPlato() {
    }

    public PedidoPlato(Integer idPedidoPlato, Integer idPedido, Integer idPlato) {
        this.idPedidoPlato = idPedidoPlato;
        this.idPedido = idPedido;
        this.idPlato = idPlato;
    }

    public Integer getIdPedidoPlato() {
        return idPedidoPlato;
    }

    public void setIdPedidoPlato(Integer idPedidoPlato) {
        this.idPedidoPlato = idPedidoPlato;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(Integer idPlato) {
        this.idPlato = idPlato;
    }
}
