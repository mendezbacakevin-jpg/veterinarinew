package com.cibertec.veterinaria.data.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "detallecita")
public class DetalleCita {
	

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_detalle;

    @ManyToOne
    @JoinColumn(name = "id_cita", referencedColumnName = "id_cita")
    private Cita cita;

    @ManyToOne
    @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
    private Servicio servicio;


    private BigDecimal precio_servicio;

    public DetalleCita() {}

	public DetalleCita(int id_detalle, Cita cita, Servicio servicio, BigDecimal precio_servicio) {
		super();
		this.id_detalle = id_detalle;
		this.cita = cita;
		this.servicio = servicio;
		this.precio_servicio = precio_servicio;
	}

	public int getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(int id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public BigDecimal getPrecio_servicio() {
		return precio_servicio;
	}

	public void setPrecio_servicio(BigDecimal precio_servicio) {
		this.precio_servicio = precio_servicio;
	}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
