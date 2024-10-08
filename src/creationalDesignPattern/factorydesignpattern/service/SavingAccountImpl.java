package creationalDesignPattern.factorydesignpattern.service;

import creationalDesignPattern.factorydesignpattern.enums.AccountType;
import creationalDesignPattern.factorydesignpattern.helper.AccountCreationHelper;
import creationalDesignPattern.factorydesignpattern.model.AccountTypeModel;
import creationalDesignPattern.factorydesignpattern.model.CustomerModel;

public class SavingAccountImpl implements Account{

    @Override
    public AccountTypeModel createAccount(CustomerModel customerModel) {
        AccountCreationHelper helper = new AccountCreationHelper();
        return helper.createAccount(customerModel, "Interest-bearing savings", "0", AccountType.SAVING);
    }
}
