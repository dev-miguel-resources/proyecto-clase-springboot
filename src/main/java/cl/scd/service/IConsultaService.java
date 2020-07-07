package cl.scd.service;

import java.util.List;

import cl.scd.dto.ConsultaListaExamenDTO;
import cl.scd.dto.ConsultaResumenDTO;
import cl.scd.dto.FiltroConsultaDTO;
import cl.scd.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta> {
	
	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
	
	List<Consulta> buscar(FiltroConsultaDTO filtro);
	
	List<Consulta> buscarFecha(FiltroConsultaDTO filtro);
	
	List<ConsultaResumenDTO> listarResumen(); //procedimiento almacenado
	
	byte[] generarReporte(); // pdf y el manejo de jasper reports
	
	

}
