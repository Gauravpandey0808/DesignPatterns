package creationalDesignPattern.factorydesignpattern;

import creationalDesignPattern.factorydesignpattern.accountFactory.AccountFactory;
import creationalDesignPattern.factorydesignpattern.enums.AccountType;
import creationalDesignPattern.factorydesignpattern.helper.AccountCreationHelper;
import creationalDesignPattern.factorydesignpattern.model.AccountTypeModel;
import creationalDesignPattern.factorydesignpattern.model.CustomerModel;
import creationalDesignPattern.factorydesignpattern.service.Account;

/**
 * <h3>Factory Design Pattern </h3>
 * <p>
 *     In this pattern we are taking example of different types of account
 *     </p>
 *
 *     <ul>
 *         <li>Savings</li>
 *         <li>Current</li>
 *         <li>joint</li>
 *         <li>fixed deposit</li>
 *     </ul>
 *
 *
 */

public class FactoryDesignPatternMainClass {
    public static void main(String[] args) {
        AccountCreationHelper accountCreationHelper = new AccountCreationHelper();
        CustomerModel customerModel = accountCreationHelper.setCustomerDetails("Gaurav", "Pandey" ,"Aadhaar:9294929329392392");

        AccountFactory accountFactory = new AccountFactory();
        Account account =accountFactory.getAccount(AccountType.JOINT);

        AccountTypeModel accountTypeModel  =account.createAccount(customerModel);

        System.out.println("Account no is "+ accountTypeModel.getAccountNo());
        System.out.println("Account type is "+accountTypeModel.getAccountType());
        System.out.println("Account scope is "+accountTypeModel.getScope());
    }
}
