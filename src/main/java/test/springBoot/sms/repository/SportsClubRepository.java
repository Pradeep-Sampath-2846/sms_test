package test.springBoot.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.springBoot.sms.Entity.SportsClub;

@Repository
public interface SportsClubRepository extends CrudRepository<SportsClub,Integer> {
}
