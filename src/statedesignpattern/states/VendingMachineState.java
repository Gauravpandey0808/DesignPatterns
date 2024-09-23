package statedesignpattern.states;

public interface VendingMachineState {

    VendingMachineState startMachine(VendingMachineState vendingMachineState) throws Exception;

    void insertCoin(int currentDenomination , VendingMachineState vendingMachineState) throws Exception;

    VendingMachineState stateChangeButton(VendingMachineState vendingMachineState) throws Exception;

    VendingMachineState chooseProduct(VendingMachineState vendingMachineState) throws Exception;

    void refundAmount(VendingMachineState vendingMachineState) throws Exception;

    VendingMachineState dispenseProduct(VendingMachineState vendingMachineState) throws Exception;

}
