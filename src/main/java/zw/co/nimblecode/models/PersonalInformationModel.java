package zw.co.nimblecode.models;

public class PersonalInformationModel {
    private String firstName;
    private String lastName;
    private String title;
    private String gender;
    private String maritalStatus;
    private String dob;
    private Integer numberOfDependants;
    private String passportPhotoUrl;

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getNumberOfDependants() {
        return numberOfDependants;
    }

    public void setNumberOfDependants(Integer numberOfDependants) {
        this.numberOfDependants = numberOfDependants;
    }

    public String getPassportPhotoUrl() {
        return passportPhotoUrl;
    }

    public void setPassportPhotoUrl(String passportPhotoUrl) {
        this.passportPhotoUrl = passportPhotoUrl;
    }
}
