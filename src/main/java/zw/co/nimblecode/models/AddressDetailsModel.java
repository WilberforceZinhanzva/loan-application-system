package zw.co.nimblecode.models;

import java.util.List;

public class AddressDetailsModel {
    private String cityOrTown;
    private String email;
    private List<PhoneNumberModel> phoneNumbers;
    private String physicalAddress;
    private String province;


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

    public List<PhoneNumberModel> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumberModel> phoneNumbers) {
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
}
