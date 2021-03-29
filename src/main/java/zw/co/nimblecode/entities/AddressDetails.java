package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import zw.co.nimblecode.models.AddressDetailsModel;
import zw.co.nimblecode.models.PhoneNumberModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressDetails {
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String cityOrTown;
    @Column(nullable = false)
    private String email;
    @JsonManagedReference
    @OneToMany(mappedBy="addressDetails",cascade=CascadeType.ALL)
    private List<PhoneNumber> phoneNumbers;
    @Column(nullable = false)
    private String physicalAddress;
    @Column(nullable = false)
    private String province;
    @JsonBackReference
    @OneToOne(mappedBy="addressDetails")
    private LoanApplication loanApplication;

    //[CONSTRUCTORS]
    public AddressDetails(){
        super();
    }

    public AddressDetails(AddressDetailsModel model){
        this.cityOrTown = model.getCityOrTown();
        this.email = model.getEmail();
        this.phoneNumbers = new ArrayList<>();
        for(PhoneNumberModel numberModel : model.getPhoneNumbers()){
            this.phoneNumbers.add(new PhoneNumber(numberModel));
        }
        this.physicalAddress = model.getPhysicalAddress();
        this.province = model.getProvince();


    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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
}
