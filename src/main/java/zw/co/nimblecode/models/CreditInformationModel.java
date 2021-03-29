package zw.co.nimblecode.models;

public class CreditInformationModel {
    private Float allInPriceRate;
    private String firstInstallmentDate;
    private String lastInstallmentDate;
    private Double loanAmount;
    private DurationModel loanPeriod;
    private Double monthlyInstallment;

    public Float getAllInPriceRate() {
        return allInPriceRate;
    }

    public void setAllInPriceRate(Float allInPriceRate) {
        this.allInPriceRate = allInPriceRate;
    }

    public String getFirstInstallmentDate() {
        return firstInstallmentDate;
    }

    public void setFirstInstallmentDate(String firstInstallmentDate) {
        this.firstInstallmentDate = firstInstallmentDate;
    }

    public String getLastInstallmentDate() {
        return lastInstallmentDate;
    }

    public void setLastInstallmentDate(String lastInstallmentDate) {
        this.lastInstallmentDate = lastInstallmentDate;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public DurationModel getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(DurationModel loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public Double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(Double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }
}
