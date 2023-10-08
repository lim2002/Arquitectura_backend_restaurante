package com.example.mspedido.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "pedido_fecha", nullable = false)
    private Date pedidoFecha;

    @Column(name = "pedido_hora", nullable = false)
    private String pedidoHora;

    @Column(name = "pedido_extra", nullable = false)
    private String pedidoExtra;

    @Column(name = "pedido_estado", nullable = false)
    private Integer pedidoEstado;

    @Column(name = "pedido_activo", nullable = false)
    private Boolean pedidoActivo;

    public Pedido() {
    }

    public Pedido(Integer idPedido, Integer idUsuario, Date pedidoFecha, String pedidoHora, String pedidoExtra, Integer pedidoEstado, Boolean pedidoActivo) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.pedidoFecha = pedidoFecha;
        this.pedidoHora = pedidoHora;
        this.pedidoExtra = pedidoExtra;
        this.pedidoEstado = pedidoEstado;
        this.pedidoActivo = pedidoActivo;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getPedidoFecha() {
        return pedidoFecha;
    }

    public void setPedidoFecha(Date pedidoFecha) {
        this.pedidoFecha = pedidoFecha;
    }

    public String getPedidoHora() {
        return pedidoHora;
    }

    public void setPedidoHora(String pedidoHora) {
        this.pedidoHora = pedidoHora;
    }

    public String getPedidoExtra() {
        return pedidoExtra;
    }

    public void setPedidoExtra(String pedidoExtra) {
        this.pedidoExtra = pedidoExtra;
    }

    public Integer getPedidoEstado() {
        return pedidoEstado;
    }

    public void setPedidoEstado(Integer pedidoEstado) {
        this.pedidoEstado = pedidoEstado;
    }

    public Boolean getPedidoActivo() {
        return pedidoActivo;
    }

    public void setPedidoActivo(Boolean pedidoActivo) {
        this.pedidoActivo = pedidoActivo;
    }

    @Override
    public String toString() {
        return "Pedidio{" +
                "idPedido=" + idPedido +
                ", idUsuario=" + idUsuario +
                ", pedidoFecha=" + pedidoFecha +
                ", pedidoHora='" + pedidoHora + '\'' +
                ", pedidoExtra='" + pedidoExtra + '\'' +
                ", pedidoEstado=" + pedidoEstado +
                ", pedidoActivo=" + pedidoActivo +
                '}';
    }
}
