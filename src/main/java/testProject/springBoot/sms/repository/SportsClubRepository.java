package testProject.springBoot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testProject.springBoot.sms.Entity.SportsClub;

public interface SportsClubRepository extends JpaRepository<SportsClub,Integer> {
}
