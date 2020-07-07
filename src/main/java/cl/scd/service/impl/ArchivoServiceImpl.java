package cl.scd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.scd.repo.IArchivoRepo;
import cl.scd.service.IArchivoService;

@Service
public class ArchivoServiceImpl implements IArchivoService {
	
	@Autowired
	private IArchivoRepo repo;

}
