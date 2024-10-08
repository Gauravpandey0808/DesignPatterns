package creationalDesignPattern.factorydesignpattern.service;

import creationalDesignPattern.factorydesignpattern.model.AccountTypeModel;
import creationalDesignPattern.factorydesignpattern.model.CustomerModel;

public interface Account {

    AccountTypeModel createAccount(CustomerModel customerModel);
}
