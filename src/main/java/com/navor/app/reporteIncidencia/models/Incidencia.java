package com.navor.app.reporteIncidencia.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="incidencias")
@Entity
public class Incidencia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CUST_SEQ4")
	@SequenceGenerator(sequenceName="customer_seq4", allocationSize=1, name="CUST_SEQ4")
	private Long id_incidencia;
	
	@Column
	private Long operador_id;
	
	@Column
	private Long equipo_id;
	
	@Column
	private Date create_at;

	@Column
	private Date update_at;

	public Long getId_incidencia() {
		return id_incidencia;
	}

	public void setId_incidencia(Long id_incidencia) {
		this.id_incidencia = id_incidencia;
	}

	public Long getOperador_id() {
		return operador_id;
	}

	public void setOperador_id(Long operador_id) {
		this.operador_id = operador_id;
	}

	public Long getEquipo_id() {
		return equipo_id;
	}

	public void setEquipo_id(Long equipo_id) {
		this.equipo_id = equipo_id;
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
