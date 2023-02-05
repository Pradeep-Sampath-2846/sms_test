package testProject.springBoot.sms.service.impl;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import testProject.springBoot.sms.Entity.Student;
import testProject.springBoot.sms.repository.StudentRepository;
import testProject.springBoot.sms.service.StudentService;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Integer id) {
        Optional<Student> byId = studentRepository.findById(id);
        return byId.get();
    }
}
