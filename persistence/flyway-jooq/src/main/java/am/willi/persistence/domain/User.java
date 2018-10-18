package am.willi.persistence.domain;

import am.willi.persistence.domain.public_.tables.records.UsersRecord;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Data
public class User {

    @NotBlank
    @Column(unique = true)
    @Size(min = 1, max = 100)
    private String username;

    @NotBlank
    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;

    @Id
    @Size(max = 255)
    private String emailid;

    @NotBlank
    @Size(max = 255)
    private String password;

//    private Address address;

    @Size(max = 255)
    private String practiceName;

    private boolean primaryUser;

    public User() {
        // Empty
    }

    public User(UsersRecord record) {
        this.setEmailid(record.getEmailid());
        this.setUsername(record.getUsername());
        this.setFirstName(record.getFirstName());
        this.setLastName(record.getLastName());
        this.setPassword(record.getPasswordHash());
    }
}
