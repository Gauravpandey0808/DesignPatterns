package creationalDesignPattern.factorydesignpattern.model;

import creationalDesignPattern.factorydesignpattern.enums.AccountType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountTypeModel {

    private String accountNo;

    private String accountHolderFirstName;

    private String accountHolderLastName;

    private AccountType accountType;

    private String currentBalance;

    private String scope;
}
