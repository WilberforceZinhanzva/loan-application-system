package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import zw.co.nimblecode.models.PersonalInformationModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class PersonalInformation {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String maritalStatus;
    @Column(nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    private int numberOfDependants;
    @Column(nullable = false)
    private String passportPhotoUrl;
    @JsonBackReference
    @OneToOne(mappedBy="personalInformation")
    private LoanApplication loanApplication;

    //[CONSTRUCTORS]
    public  PersonalInformation(){
        super();
    }

    public PersonalInformation(PersonalInformationModel model){
        this.firstName = model.getFirstName();
        this.lastName = model.getLastName();
        this.title = model.getTitle();
        this.gender = model.getGender();
        this.maritalStatus = model.getMaritalStatus();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dob = LocalDate.parse(model.getDob(),f);
        this.numberOfDependants = model.getNumberOfDependants();
        this.passportPhotoUrl = model.getPassportPhotoUrl();


    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getNumberOfDependants() {
        return numberOfDependants;
    }

    public void setNumberOfDependants(int numberOfDependants) {
        this.numberOfDependants = numberOfDependants;
    }

    public String getPassportPhotoUrl() {
        return passportPhotoUrl;
    }

    public void setPassportPhotoUrl(String passportPhotoUrl) {
        this.passportPhotoUrl = passportPhotoUrl;
    }
}
