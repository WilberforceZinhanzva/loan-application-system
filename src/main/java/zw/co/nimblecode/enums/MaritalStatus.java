package zw.co.nimblecode.enums;

public enum MaritalStatus {
    SINGLE("Single"),MARRIED("Married"),DIVORCED("Divorced"),WIDOWED("Widowed");

    private final String value;

    MaritalStatus(String value){
        this.value = value;
    }
}
