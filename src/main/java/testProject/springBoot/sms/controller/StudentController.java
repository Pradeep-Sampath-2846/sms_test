package testProject.springBoot.sms.controller;

import org.springframework.web.bind.annotation.*;
import testProject.springBoot.sms.Entity.Student;
import testProject.springBoot.sms.service.StudentService;

@RestController
@RequestMapping("/sms/api/students")
@CrossOrigin
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public void saveStudent(@RequestBody Student student){
        System.out.println("this is from controller: "+student);
        studentService.saveStudent(student);
    }
    @GetMapping("{id}")
    public Student findStudent(@RequestParam int id){
        Student studentById = studentService.findStudentById(id);
        System.out.println(studentById);
        return studentById;
    }
}
