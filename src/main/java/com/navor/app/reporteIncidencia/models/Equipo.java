package com.navor.app.reporteIncidencia.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="equipos")
@Entity
public class Equipo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CUST_SEQ4")
	@SequenceGenerator(sequenceName="customer_seq4", allocationSize=1, name="CUST_SEQ4")
	private Long id_equipo;
	
	@Column
	private String descripcion;
	
	@Column
	private Date create_at;
	
	@Column
	private Date update_at;

	public Long getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(Long id_equipo) {
		this.id_equipo = id_equipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	
	
	
}
