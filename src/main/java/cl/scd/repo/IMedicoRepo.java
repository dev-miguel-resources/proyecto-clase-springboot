package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Medico;

public interface IMedicoRepo extends JpaRepository<Medico, Integer> {

}
