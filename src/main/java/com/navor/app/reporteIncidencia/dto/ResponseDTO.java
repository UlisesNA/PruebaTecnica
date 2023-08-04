package com.navor.app.reporteIncidencia.dto;

import java.util.List;

public class ResponseDTO <T>{
	private String estatus;
	private String msg;
	private List<T> contenido;
	
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<T> getContenido() {
		return contenido;
	}
	public void setContenido(List<T> contenido) {
		this.contenido = contenido;
	}
	
	
}
