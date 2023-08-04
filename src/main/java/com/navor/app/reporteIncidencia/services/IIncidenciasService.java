package com.navor.app.reporteIncidencia.services;

import java.util.ArrayList;
import java.util.List;

import com.navor.app.reporteIncidencia.dto.IncidenciaListDTO;
import com.navor.app.reporteIncidencia.dto.ResponseDTO;

public class IIncidenciasService implements IService<IncidenciaListDTO, Long>{
	@Override
	public ResponseDTO<IncidenciaListDTO> getByFilter(Long filtro) {
			List<IncidenciaListDTO> listaIncidenciasDTO = new ArrayList<>();
			ResponseDTO<IncidenciaListDTO> respuesta= new ResponseDTO<>();
			respuesta.setEstatus("Ok");
			respuesta.setMsg("correcto");
			respuesta.setContenido(listaIncidenciasDTO);
			return respuesta;
	}
}
