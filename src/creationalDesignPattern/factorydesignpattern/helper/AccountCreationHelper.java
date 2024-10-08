package creationalDesignPattern.factorydesignpattern.helper;

import creationalDesignPattern.factorydesignpattern.enums.AccountType;
import creationalDesignPattern.factorydesignpattern.model.AccountTypeModel;
import creationalDesignPattern.factorydesignpattern.model.CustomerModel;

public class AccountCreationHelper {

    public AccountTypeModel createAccount(CustomerModel customerModel, String scope, String currentBalance, AccountType accountType) {
        AccountTypeModel accountTypeModel = new AccountTypeModel();

        accountTypeModel.setAccountNo("12345635456564545");
        accountTypeModel.setAccountHolderFirstName(customerModel.getFirstName());
        accountTypeModel.setAccountHolderLastName(customerModel.getLastName());
        accountTypeModel.setScope(scope);
        accountTypeModel.setCurrentBalance(currentBalance);
        accountTypeModel.setAccountType(accountType);

        return accountTypeModel;
    }

    public CustomerModel setCustomerDetails(String fName, String lName, String id ) {
        CustomerModel customerModel = new CustomerModel();
        customerModel.setFirstName(fName);
        customerModel.setLastName(lName);
        customerModel.setVerificationId(id);
        return customerModel;
    }
}
