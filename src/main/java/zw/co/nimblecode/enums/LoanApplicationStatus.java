package zw.co.nimblecode.enums;

public enum LoanApplicationStatus {
    NEW_BUSINESS("NEW_BUSINESS"),UNDER_CONSIDERATION("UNDER_CONSIDERATION"),REJECTED("REJECTED"),APPROVED("APPROVED");

    private final String value;
    LoanApplicationStatus(String value){
        this.value = value;
    }
}
