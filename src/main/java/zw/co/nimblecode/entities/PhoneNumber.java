package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import zw.co.nimblecode.models.PhoneNumberModel;

import javax.persistence.*;
@Entity
public class PhoneNumber {
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private String digits;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="address_details_id")
    private AddressDetails addressDetails;
    @JsonBackReference
    @OneToOne(mappedBy="workTelNumber")
    private EmploymentDetails employmentDetails;

    //[CONSTRUCTORS]
    public PhoneNumber(){
        super();
    }
    public PhoneNumber(PhoneNumberModel model){
        this.code = model.getCode();
        this.digits = model.getDigits();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
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

    public EmploymentDetails getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(EmploymentDetails employmentDetails) {
        this.employmentDetails = employmentDetails;
    }
}
