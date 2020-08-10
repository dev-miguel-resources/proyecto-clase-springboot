package cl.scd.service;

import java.util.List;

import cl.scd.model.ConsultaExamen;

public interface IConsultaExamenService {

	List<ConsultaExamen> listarExamenesPorConsulta(Integer idconsulta);
}
