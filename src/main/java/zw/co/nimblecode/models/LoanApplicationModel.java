package zw.co.nimblecode.models;

public class LoanApplicationModel {
    private AddressDetailsModel addressDetails;
    private AdditionalRequirementsModel additionalRequirements;
    private BankingDetailsModel bankingDetails;
    private CreditInformationModel creditInformation;
    private EmploymentDetailsModel employmentDetails;
    private PersonalInformationModel personalInformation;

    public AddressDetailsModel getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetailsModel addressDetails) {
        this.addressDetails = addressDetails;
    }

    public AdditionalRequirementsModel getAdditionalRequirements() {
        return additionalRequirements;
    }

    public void setAdditionalRequirements(AdditionalRequirementsModel additionalRequirements) {
        this.additionalRequirements = additionalRequirements;
    }

    public BankingDetailsModel getBankingDetails() {
        return bankingDetails;
    }

    public void setBankingDetails(BankingDetailsModel bankingDetails) {
        this.bankingDetails = bankingDetails;
    }

    public CreditInformationModel getCreditInformation() {
        return creditInformation;
    }

    public void setCreditInformation(CreditInformationModel creditInformation) {
        this.creditInformation = creditInformation;
    }

    public EmploymentDetailsModel getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(EmploymentDetailsModel employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public PersonalInformationModel getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformationModel personalInformation) {
        this.personalInformation = personalInformation;
    }
}
