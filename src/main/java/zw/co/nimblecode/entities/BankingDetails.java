package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import zw.co.nimblecode.models.BankingDetailsModel;

import javax.persistence.*;

@Entity
public class BankingDetails {
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String accountNumber;
    @JsonBackReference
    @OneToOne(mappedBy="bankingDetails")
    private LoanApplication loanApplication;

    //[CONSTRUCTORS]
    public BankingDetails(){
        super();
    }

    public BankingDetails(BankingDetailsModel model){
        this.accountNumber = model.getAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
