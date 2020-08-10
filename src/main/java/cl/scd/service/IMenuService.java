package cl.scd.service;

import java.util.List;

import cl.scd.model.Menu;

public interface IMenuService extends ICRUD<Menu>{
	
	List<Menu> listarMenuPorUsuario(String nombre);
}
