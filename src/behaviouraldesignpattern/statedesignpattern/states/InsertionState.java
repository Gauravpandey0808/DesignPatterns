package behaviouraldesignpattern.statedesignpattern.states;

import behaviouraldesignpattern.statedesignpattern.dto.SelectedProductDto;

public class InsertionState  implements VendingMachineState {

    private final SelectedProductDto selectedProductDto;

    public InsertionState(SelectedProductDto selectedProductDto) {
        this.selectedProductDto = selectedProductDto;
    }

    @Override
    public VendingMachineState startMachine(VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    @Override
    public void insertCoin(int currentDenomination, VendingMachineState vendingMachineState) {
        System.out.println("Inserted note"+currentDenomination);
        AddAmountToTotalAmountInserted(currentDenomination);
    }

    @Override
    public VendingMachineState stateChangeButton(VendingMachineState vendingMachineState) {
        return new SelectionState(selectedProductDto);
    }

    @Override
    public VendingMachineState chooseProduct(VendingMachineState vendingMachineState)  throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    @Override
    public void refundAmount(VendingMachineState vendingMachineState)  {
        System.out.println("Refunded the amount and the amount refunded is :"+selectedProductDto.getCurrentTotalAmountInserted());
    }

    @Override
    public VendingMachineState dispenseProduct(VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    private void AddAmountToTotalAmountInserted(int currentDenomination) {
        int currentPriceAccumulated = selectedProductDto.getCurrentTotalAmountInserted();
        selectedProductDto.setCurrentTotalAmountInserted(currentPriceAccumulated + currentDenomination);
    }

    public SelectedProductDto getSelectedProductDto() {
        return this.selectedProductDto;
    }

}
