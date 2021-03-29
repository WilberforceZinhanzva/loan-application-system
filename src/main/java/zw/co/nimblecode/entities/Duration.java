package zw.co.nimblecode.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import zw.co.nimblecode.models.DurationModel;

import javax.persistence.*;

@Entity
public class Duration {
    @Id @GeneratedValue
    private int id;
    @Column(nullable=false)
    private int days;
    @Column(nullable=false)
    private int months;
    @Column(nullable=false)
    private int years;
    @JsonBackReference
    @OneToOne(mappedBy="loanPeriod")
    private CreditInformation creditInformation;
    @JsonBackReference
    @OneToOne(mappedBy = "lengthOfService")
    private EmploymentDetails employmentDetails;

    //[CONSTRUCTORS]
    public Duration(){
        super();
    }
    public Duration(DurationModel model){
        this.days = model.getDays();
        this.months = model.getMonths();
        this.years = model.getYears();

    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
