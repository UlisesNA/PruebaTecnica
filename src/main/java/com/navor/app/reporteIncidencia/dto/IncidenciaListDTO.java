package com.navor.app.reporteIncidencia.dto;

import java.sql.Date;

public class IncidenciaListDTO {
	private Long id_incidencia;
	private Long operador_id;
	private Long equipo_id;
	private Date create_at;
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
