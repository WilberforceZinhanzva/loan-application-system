package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import zw.co.nimblecode.enums.LoanApplicationStatus;
import zw.co.nimblecode.models.LoanApplicationModel;

import javax.persistence.*;

@Entity
public class LoanApplication {
    @Id @GeneratedValue
    private int id;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="address_details_id")
    private AddressDetails addressDetails;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="additional_requirements_id")
    private AdditionalRequirements additionalRequirements;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="banking_details_id")
    private BankingDetails bankingDetails;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="credit_information_id")
    private CreditInformation creditInformation;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="employment_details_id")
    private EmploymentDetails employmentDetails;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="personal_information")
    private PersonalInformation personalInformation;
    private String status;

    //[CONSTRUCTORS]
    public LoanApplication(){
        super();
    }

    public LoanApplication(LoanApplicationModel model){
        this.addressDetails = new AddressDetails(model.getAddressDetails());
        this.additionalRequirements = new AdditionalRequirements(model.getAdditionalRequirements());
        this.bankingDetails = new BankingDetails(model.getBankingDetails());
        this.creditInformation = new CreditInformation(model.getCreditInformation());
        this.employmentDetails = new EmploymentDetails(model.getEmploymentDetails());
        this.personalInformation = new PersonalInformation(model.getPersonalInformation());
        this.status = LoanApplicationStatus.NEW_BUSINESS.name();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    public AdditionalRequirements getAdditionalRequirements() {
        return additionalRequirements;
    }

    public void setAdditionalRequirements(AdditionalRequirements additionalRequirements) {
        this.additionalRequirements = additionalRequirements;
    }

    public BankingDetails getBankingDetails() {
        return bankingDetails;
    }

    public void setBankingDetails(BankingDetails bankingDetails) {
        this.bankingDetails = bankingDetails;
    }

    public CreditInformation getCreditInformation() {
        return creditInformation;
    }

    public void setCreditInformation(CreditInformation creditInformation) {
        this.creditInformation = creditInformation;
    }

    public EmploymentDetails getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(EmploymentDetails employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
