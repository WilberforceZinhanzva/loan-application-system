package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import zw.co.nimblecode.models.EmploymentDetailsModel;

import javax.persistence.*;

@Entity
public class EmploymentDetails {
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String employeeNumber;
    @Column(nullable = false)
    private String employerName;
    @Column(nullable = false)
    private Double grossSalary;
    @Column(nullable = false)
    private Boolean fullTimeStaff;
    @Column(nullable = false)
    private String jobTitleOrRank;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="length_of_service_id")
    private Duration lengthOfService;
    @Column(nullable = false)
    private Double netSalary;
    @Column(nullable = false)
    private String workAddress;
    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="work_tel_number_id")
    private PhoneNumber workTelNumber;
    @JsonBackReference
    @OneToOne(mappedBy="employmentDetails")
    private LoanApplication loanApplication;


    //[CONSTRUCTORS]
    public EmploymentDetails(){
        super();
    }
    public EmploymentDetails(EmploymentDetailsModel model){
        this.employeeNumber = model.getEmployeeNumber();
        this.employerName = model.getEmployerName();
        this.grossSalary = model.getGrossSalary();
        this.fullTimeStaff = model.getFullTimeStaff();
        this.jobTitleOrRank = model.getJobTitleOrRank();
        this.lengthOfService = new Duration(model.getLengthOfService());
        this.netSalary = model.getNetSalary();
        this.workAddress = model.getWorkAddress();
        this.workTelNumber = new PhoneNumber(model.getWorkTelNumber());

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
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

    public Duration getLengthOfService() {
        return lengthOfService;
    }

    public void setLengthOfService(Duration lengthOfService) {
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

    public PhoneNumber getWorkTelNumber() {
        return workTelNumber;
    }

    public void setWorkTelNumber(PhoneNumber workTelNumber) {
        this.workTelNumber = workTelNumber;
    }
}
