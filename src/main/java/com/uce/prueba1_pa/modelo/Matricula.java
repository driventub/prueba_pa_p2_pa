package com.uce.prueba1_pa.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "matricula")
public class Matricula {

    @Id
    @Column(name = "matr_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matr_id_seq")
    @SequenceGenerator(name = "matr_id_seq", sequenceName = "matr_id_seq")
    private Integer id;

    @Column(name = "matr_fecha")
    private LocalDateTime fecha;

    @Column(name = "matr_valor")
    private BigDecimal valor;

    @Column(name = "matr_propietario")
    private Propietario propietario;

    @Column(name = "matr_vehiculo")
    private Vehiculo vehiculo;

    // Set y GEt
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Matricula [fecha=" + fecha + ", id=" + id + ", propietario=" + propietario + ", valor=" + valor
                + ", vehiculo=" + vehiculo + "]";
    }

    
}
