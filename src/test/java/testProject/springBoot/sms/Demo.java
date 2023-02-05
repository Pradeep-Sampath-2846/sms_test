package testProject.springBoot.sms;

import org.junit.jupiter.api.Test;
import testProject.springBoot.sms.Entity.School;
import testProject.springBoot.sms.Entity.Student;
import testProject.springBoot.sms.repository.StudentRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    StudentRepository studentRepository;

    @Test
    void name() {
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
            studentRepository.save(new Student(2,"pradeep","panamura",24,bytes,school));
        } catch (FileNotFoundException e) {
            System.out.println("there is no file inside");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
