package test.springBoot.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.springBoot.sms.Entity.School;

@Repository
public interface SchoolRepository extends CrudRepository<School,Integer> {
}
