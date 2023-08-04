package com.navor.app.reporteIncidencia.services;

import com.navor.app.reporteIncidencia.dto.IncidenciaListDTO;
import com.navor.app.reporteIncidencia.dto.ResponseDTO;

public interface IService <T,S>{

	ResponseDTO<IncidenciaListDTO> getByFilter(Long filtro);
	
}
