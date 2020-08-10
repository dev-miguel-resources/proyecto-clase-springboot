package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.ResetToken;

public interface IResetTokenRepo extends JpaRepository<ResetToken, Integer> {
	
	//from ResetToken where token = :?
	ResetToken findByToken(String token);

}
