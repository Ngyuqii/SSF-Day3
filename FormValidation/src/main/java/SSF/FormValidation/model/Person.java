package SSF.FormValidation.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class Person {

    @NotNull(message="This field cannot be left empty.")
    @Size(min=1, max=30, message="Name must be contain at least 1, and up to 30 characters.")
    private String name;

    @NotEmpty(message="This field cannot be left empty.")
    private String gender;

    @NotNull(message="This field cannot be left empty.")
    @Size (min=8, max=8, message="Phone number should contain 8 digits.")
    private String phoneNumber;

    @Email(message="Invalid email address")
    private String email;

    @NotNull(message="This field cannot be left empty.")
    @Past(message="Date of Birth must be in the past.")
    @DateTimeFormat(pattern="DD-MM-YYYY")
    private LocalDate dateOfBirth;

    @NotEmpty(message="Please select at least 1 apparatus.")
    private List<String> hobbies;

    //Constructor
    public Person() {
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    
 }
