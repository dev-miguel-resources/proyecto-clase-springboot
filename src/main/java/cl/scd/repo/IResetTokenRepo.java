package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.ResetToken;

public interface IResetTokenRepo extends JpaRepository<ResetToken, Integer> {
	
	
	// Query method o query predefinida
	
	// from ResetToken where token = :?
	ResetToken findByToken(String token);

}
