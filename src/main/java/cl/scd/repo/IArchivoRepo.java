package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Archivo;

public interface IArchivoRepo extends JpaRepository<Archivo, Integer> {

}
