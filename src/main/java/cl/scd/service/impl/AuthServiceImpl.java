package cl.scd.service.impl;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl {
	
	public boolean tieneAcceso(String path) {
		boolean rpta = false;
		
		String metodoRol = "";
		
		switch(path) {
		case "listar":
			metodoRol = "ADMIN";
			break;
		case "listarId":
			metodoRol = "ADMIN,USER,DBA";
			break;
		}
		
		String metodoRoles[] = metodoRol.split(",");
		
		Authentication usuarioLogueado = SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println(usuarioLogueado.getName());
		
		for(GrantedAuthority auth : usuarioLogueado.getAuthorities()) {
			String rolUser = auth.getAuthority();
			
			System.out.println(rolUser);
			
			for(String rolMet : metodoRoles) {
				if(rolUser.equalsIgnoreCase(rolMet)) {
					rpta = true;
				}
			}
		}
		return rpta;
	}
}
