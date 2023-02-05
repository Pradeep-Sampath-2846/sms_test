package testProject.springBoot.sms.service;

import testProject.springBoot.sms.Entity.Student;

public interface StudentService {
    public Student saveStudent(Student student);

    public Student findStudentById(Integer id);
}
