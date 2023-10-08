package com.example.mspedido.Dto;

import java.util.Date;

public class PedidioDto {

    private Integer idPedido;
    private Integer idUsuario;
    private Date pedidoFecha;
    private String pedidoHora;
    private String pedidoExtra;
    private Integer pedidoEstado;
    private Boolean pedidoActivo;

    public PedidioDto() {
    }

    public PedidioDto(Integer idPedido, Integer idUsuario, Date pedidoFecha, String pedidoHora, String pedidoExtra, Integer pedidoEstado, Boolean pedidoActivo) {
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
        return "PedidioDto{" +
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
