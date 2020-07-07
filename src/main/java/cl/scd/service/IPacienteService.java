package cl.scd.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cl.scd.model.Paciente;

public interface IPacienteService extends ICRUD<Paciente> {
	
	Page<Paciente> listarPageable(Pageable pageable);

}
