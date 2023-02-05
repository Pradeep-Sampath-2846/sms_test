package testProject.springBoot.sms.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class School implements SuperEntity{
    @Id
    private int id;
    private String name;
    private String address;
}
