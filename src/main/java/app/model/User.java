package app.model;

import lombok.Builder;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Builder
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private  String firstName;

    @Column(name = "middle_name")
    private  String middleName;

    @Column(name = "last_name")
    private  String lastName;

    @Column(name = "date_of_birth")
    private String dob;

    @Column(name = "user_password")
    private String password;

    @Column(name = "date_of_registration")
    private String date_of_registration;

    @Column(name = "email")
    private String email;

    @Column(name = "user_role")
    private String userRole;

    public User(Long id, String firstName, String middleName,
                String lastName, String dob, String password,
                String date_of_registration, String email, String role) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.password = password;
        this.date_of_registration = date_of_registration;
        this.email = email;
        this.userRole = role;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate_of_registration() {
        return date_of_registration;
    }

    public void setDate_of_registration(String date_of_registration) {
        this.date_of_registration = date_of_registration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", password='" + password + '\'' +
                ", date_of_registration=" + date_of_registration +
                ", email='" + email + '\'' +
                ", user_role='" + userRole + '\'' +
                '}';
    }
}
