package behaviouraldesignpattern.statedesignpattern.states;

import behaviouraldesignpattern.statedesignpattern.dto.SelectedProductDto;

public class idleState implements VendingMachineState {

    public idleState() {
        System.out.println("Thanks for choosing us");
    }
    @Override
    public VendingMachineState startMachine(VendingMachineState vendingMachineState) throws Exception {
        System.out.println("Start inserting the cash");
        return vendingMachineState.stateChangeButton(vendingMachineState);
    }

    @Override
    public void insertCoin(int currentDenomination, VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");

    }

    @Override
    public VendingMachineState stateChangeButton(VendingMachineState vendingMachineState) {
        return new InsertionState(new SelectedProductDto());
    }

    @Override
    public VendingMachineState chooseProduct(VendingMachineState vendingMachineState)throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }


    @Override
    public void refundAmount(VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    @Override
    public VendingMachineState dispenseProduct(VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }
}
