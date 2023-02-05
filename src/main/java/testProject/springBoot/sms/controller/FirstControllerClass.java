package testProject.springBoot.sms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testProject.springBoot.sms.Entity.School;
import testProject.springBoot.sms.Entity.Student;
import testProject.springBoot.sms.service.impl.StudentServiceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@RestController
@RequestMapping("/sms/api")
public class FirstControllerClass {
    StudentServiceImpl studentServiceImpl;


    public FirstControllerClass(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @GetMapping("/hello")
    public String methodOne(){

        File file = new File("/img/12337.jpg");
        if (!file.exists()){
            try {
                boolean newFile = file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = fis.readAllBytes();
            fis.close();

            School school = new School(10, "Emibilipitiya", "R/Emb/Embilipitiya MV");
            studentServiceImpl.saveStudent(new Student(2,"pradeep","panamura",24,bytes,school));
        } catch (FileNotFoundException e) {
            System.out.println("there is no file inside");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "<h1> Hello Im Pradeep </h1>";
    }
}
