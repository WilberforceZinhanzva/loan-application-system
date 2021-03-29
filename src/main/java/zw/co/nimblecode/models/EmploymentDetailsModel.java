package zw.co.nimblecode.models;

public class EmploymentDetailsModel {
    private String employeeNumber;
    private String employerName;
    private Double grossSalary;
    private Boolean fullTimeStaff;
    private String jobTitleOrRank;
    private DurationModel lengthOfService;
    private Double netSalary;
    private String workAddress;
    private PhoneNumberModel workTelNumber;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Boolean getFullTimeStaff() {
        return fullTimeStaff;
    }

    public void setFullTimeStaff(Boolean fullTimeStaff) {
        this.fullTimeStaff = fullTimeStaff;
    }

    public String getJobTitleOrRank() {
        return jobTitleOrRank;
    }

    public void setJobTitleOrRank(String jobTitleOrRank) {
        this.jobTitleOrRank = jobTitleOrRank;
    }

    public DurationModel getLengthOfService() {
        return lengthOfService;
    }

    public void setLengthOfService(DurationModel lengthOfService) {
        this.lengthOfService = lengthOfService;
    }

    public Double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public PhoneNumberModel getWorkTelNumber() {
        return workTelNumber;
    }

    public void setWorkTelNumber(PhoneNumberModel workTelNumber) {
        this.workTelNumber = workTelNumber;
    }
}
