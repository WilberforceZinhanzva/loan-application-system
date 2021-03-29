package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import zw.co.nimblecode.models.AdditionalRequirementsModel;

import javax.persistence.*;

@Entity
public class AdditionalRequirements {
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String nationalIdUrl;
    @Column(nullable = false)
    private String payslipUrl;
    @Column(nullable = false)
    private String proofOfResidenceUrl;
    @JsonBackReference
    @OneToOne(mappedBy="additionalRequirements")
    private LoanApplication loanApplication;


    //[CONSTRUCTORS]
    public AdditionalRequirements(){
        super();
    }

    public AdditionalRequirements(AdditionalRequirementsModel model){
        this.nationalIdUrl = model.getNationalIdUrl();
        this.payslipUrl = model.getPayslipUrl();
        this.proofOfResidenceUrl = model.getProofOfResidenceUrl();
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

    public String getNationalIdUrl() {
        return nationalIdUrl;
    }

    public void setNationalIdUrl(String nationalIdUrl) {
        this.nationalIdUrl = nationalIdUrl;
    }

    public String getPayslipUrl() {
        return payslipUrl;
    }

    public void setPayslipUrl(String payslipUrl) {
        this.payslipUrl = payslipUrl;
    }

    public String getProofOfResidenceUrl() {
        return proofOfResidenceUrl;
    }

    public void setProofOfResidenceUrl(String proofOfResidenceUrl) {
        this.proofOfResidenceUrl = proofOfResidenceUrl;
    }
}
