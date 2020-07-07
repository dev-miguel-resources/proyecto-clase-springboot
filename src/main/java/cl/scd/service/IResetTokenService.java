package cl.scd.service;

import cl.scd.model.ResetToken;

public interface IResetTokenService {
	
	ResetToken findByToken(String token);
	
	void guardar(ResetToken token);
	
	void eliminar(ResetToken token);

}
