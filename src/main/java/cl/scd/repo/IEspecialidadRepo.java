package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Especialidad;

public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer> {

}
