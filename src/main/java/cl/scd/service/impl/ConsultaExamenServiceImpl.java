package cl.scd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.scd.model.ConsultaExamen;
import cl.scd.repo.IConsultaExamenRepo;
import cl.scd.service.IConsultaExamenService;

@Service
public class ConsultaExamenServiceImpl implements IConsultaExamenService{

	@Autowired
	private IConsultaExamenRepo repo;
	
	@Override
	public List<ConsultaExamen> listarExamenesPorConsulta(Integer idconsulta) {
		return repo.listarExamenesPorConsulta(idconsulta);
	}
}
