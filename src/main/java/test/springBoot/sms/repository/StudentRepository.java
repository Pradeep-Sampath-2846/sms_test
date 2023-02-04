package test.springBoot.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.springBoot.sms.Entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
}
