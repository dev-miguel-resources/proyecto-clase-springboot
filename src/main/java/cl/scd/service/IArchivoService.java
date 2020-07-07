package cl.scd.service;

import cl.scd.model.Archivo;

public interface IArchivoService {
	
	//fachadas a implementar por la capa repo
	
	int guardar(Archivo archivo);
	
	byte[] leerArchivo(Integer idArchivo);

}
