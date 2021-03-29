package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import zw.co.nimblecode.models.CreditInformationModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class CreditInformation {
    @Id @GeneratedValue
    private int id;
    @Column(nullable = false)
    private float allInPriceRate;
    @Column(nullable = false)
    private LocalDate firstInstallmentDate;
    @Column(nullable = false)
    private LocalDate lastInstallmentDate;
    @Column(nullable = false)
    private double loanAmount;
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="loan_period_id")
    private Duration loanPeriod;
    @Column(nullable = false)
    private double monthlyInstallment;
    @JsonBackReference
    @OneToOne(mappedBy="creditInformation")
    private LoanApplication loanApplication;

    //[CONSTRUCTORS]
    public CreditInformation(){
        super();
    }

    public CreditInformation(CreditInformationModel model){
        this.allInPriceRate = model.getAllInPriceRate();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.firstInstallmentDate = LocalDate.parse(model.getFirstInstallmentDate(),f);
        this.lastInstallmentDate = LocalDate.parse(model.getLastInstallmentDate(),f);
        this.loanAmount = model.getLoanAmount();
        this.loanPeriod = new Duration(model.getLoanPeriod());
        this.monthlyInstallment = model.getMonthlyInstallment();
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

    public float getAllInPriceRate() {
        return allInPriceRate;
    }

    public void setAllInPriceRate(float allInPriceRate) {
        this.allInPriceRate = allInPriceRate;
    }

    public LocalDate getFirstInstallmentDate() {
        return firstInstallmentDate;
    }

    public void setFirstInstallmentDate(LocalDate firstInstallmentDate) {
        this.firstInstallmentDate = firstInstallmentDate;
    }

    public LocalDate getLastInstallmentDate() {
        return lastInstallmentDate;
    }

    public void setLastInstallmentDate(LocalDate lastInstallmentDate) {
        this.lastInstallmentDate = lastInstallmentDate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Duration getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Duration loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

}
