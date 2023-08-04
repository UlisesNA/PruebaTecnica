package com.navor.app.reporteIncidencia.models;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="operadores")
@Entity
public class Operador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CUST_SEQ4")
	@SequenceGenerator(sequenceName="customer_seq4", allocationSize=1, name="CUST_SEQ4")
	private Long id_operador;
	
	@Column
	private String nombre;
	
	@Column
	private String ap_paterno;
	
	@Column
	private String ap_materno;
	
	@Column
	private String edad;
	
	@Column
	private Date create_at;
	
	@Column
	private Date update_at;

	public Long getId_operador() {
		return id_operador;
	}

	public void setId_operador(Long id_operador) {
		this.id_operador = id_operador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_paterno() {
		return ap_paterno;
	}

	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}

	public String getAp_materno() {
		return ap_materno;
	}

	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
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
