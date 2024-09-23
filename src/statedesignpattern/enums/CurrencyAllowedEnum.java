package statedesignpattern.enums;

public enum CurrencyAllowedEnum {

    TEN(10),TWENTY(20),FIFTY(50),HUNDRED(100);

    private final int allowedCurrency;

    CurrencyAllowedEnum(int allowedCurrency) {
        this.allowedCurrency = allowedCurrency;
    }

    public int getAllowedCurrency() {
        return this.allowedCurrency;
    }
}
