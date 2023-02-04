package test.springBoot.sms.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.type.BlobType;
import org.hibernate.type.descriptor.sql.LobTypeMappings;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Set;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class Student {
    @Id
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private int age;
    @Column(name = "profile_image")
    @Lob
    private byte[] profileImage;
    @ManyToOne
    @JoinColumn(name = "school_id",referencedColumnName = "id",nullable = false)
    private School school;

    @ManyToMany
    @JoinTable(name = "student_clubs",joinColumns = {@JoinColumn(name = "s_id")}
            ,inverseJoinColumns = {@JoinColumn(name = "c_id")})
    private Set<SportsClub> sportsClubSet;

    public Student(int id, String name, String address, int age, byte[] profileImage, School school) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.profileImage = profileImage;
        this.school = school;
    }
}
