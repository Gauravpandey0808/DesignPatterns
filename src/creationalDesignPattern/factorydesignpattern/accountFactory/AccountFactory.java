package creationalDesignPattern.factorydesignpattern.accountFactory;

import creationalDesignPattern.factorydesignpattern.enums.AccountType;
import creationalDesignPattern.factorydesignpattern.service.*;

public class AccountFactory {

    public  Account getAccount(AccountType accountType) {
        return switch(accountType) {
        case CURRENT -> new CurrentAccountImpl();
        case DEPOSIT -> new DepositAccountImpl();
        case JOINT -> new JointAccountImpl();
        case SAVING -> new SavingAccountImpl();
        };
    }
}
