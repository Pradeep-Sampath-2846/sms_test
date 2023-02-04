package test.springBoot.sms.service;

import org.springframework.stereotype.Service;
import test.springBoot.sms.Entity.Student;
import test.springBoot.sms.repository.StudentRepository;
@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student){
        studentRepository.save(student);
    }
}
