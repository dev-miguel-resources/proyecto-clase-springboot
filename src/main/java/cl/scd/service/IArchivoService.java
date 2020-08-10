package cl.scd.service;

import cl.scd.model.Archivo;

public interface IArchivoService {

	int guardar(Archivo archivo);
	byte[] leerArchivo(Integer idArchivo);
}
