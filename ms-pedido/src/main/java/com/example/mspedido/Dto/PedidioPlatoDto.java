package com.example.mspedido.Dto;

public class PedidioPlatoDto {

    private Integer idPedidoPlato;
    private Integer idPedido;
    private Integer idPlato;

    public PedidioPlatoDto() {
    }

    public PedidioPlatoDto(Integer idPedidoPlato, Integer idPedido, Integer idPlato) {
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

    @Override
    public String toString() {
        return "PedidioPlatoDto{" +
                "idPedidoPlato=" + idPedidoPlato +
                ", idPedido=" + idPedido +
                ", idPlato=" + idPlato +
                '}';
    }
}
