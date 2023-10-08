package com.example.msmenu.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tipo_plato")
@NamedQueries({
        @NamedQuery(name = "TipoPlato.findAll", query = "SELECT tp FROM TipoPlato tp"),
        @NamedQuery(name = "TipoPlato.findById", query = "SELECT tp FROM TipoPlato tp WHERE tp.idTipoPlato = :idTipoPlato")
})
public class TipoPlato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic (optional = false)
    @Column (name = "id_tipo_plato")
    private Integer idTipoPlato;
    @Basic (optional = false)
    @Column (name = "tipo_plato_tipo")
    private String tipoPlatoTipo;
    @Basic (optional = false)
    @Column (name = "tipo_plato_activo")
    private boolean tipoPlatoActivo;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "idTipoPlato", fetch = FetchType.LAZY)
    private List<Plato> platoList;

    public TipoPlato() {
    }

    public TipoPlato(Integer idTipoPlato) {
        this.idTipoPlato = idTipoPlato;
    }

    public TipoPlato(Integer idTipoPlato, String tipoPlatoTipo, boolean tipoPlatoActivo) {
        this.idTipoPlato = idTipoPlato;
        this.tipoPlatoTipo = tipoPlatoTipo;
        this.tipoPlatoActivo = tipoPlatoActivo;
    }

    public Integer getIdTipoPlato() {
        return idTipoPlato;
    }

    public void setIdTipoPlato(Integer idTipoPlato) {
        this.idTipoPlato = idTipoPlato;
    }

    public String getTipoPlatoTipo() {
        return tipoPlatoTipo;
    }

    public void setTipoPlatoTipo(String tipoPlatoTipo) {
        this.tipoPlatoTipo = tipoPlatoTipo;
    }

    public boolean isTipoPlatoActivo() {
        return tipoPlatoActivo;
    }

    public void setTipoPlatoActivo(boolean tipoPlatoActivo) {
        this.tipoPlatoActivo = tipoPlatoActivo;
    }

    public List<Plato> getPlatoList() {
        return platoList;
    }

    public void setPlatoList(List<Plato> platoList) {
        this.platoList = platoList;
    }

    @Override
    public String toString() {
        return "TipoPlato{" +
                "idTipoPlato=" + idTipoPlato +
                ", tipoPlatoTipo='" + tipoPlatoTipo + '\'' +
                ", tipoPlatoActivo=" + tipoPlatoActivo +
                ", platoList=" + platoList +
                '}';
    }
}
