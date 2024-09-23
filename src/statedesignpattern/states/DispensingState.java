package statedesignpattern.states;

import statedesignpattern.dto.ProductDto;
import statedesignpattern.dto.SelectedProductDto;

import java.util.Iterator;
import java.util.List;

public class DispensingState implements VendingMachineState {

    List<ProductDto> listOfProductDto;
    private final SelectedProductDto selectedProductDto;

    public DispensingState(SelectedProductDto selectedProductDto,  List<ProductDto> listOfProductDto) {
        this.selectedProductDto = selectedProductDto;
        this.listOfProductDto = listOfProductDto;
    }

    @Override
    public VendingMachineState startMachine(VendingMachineState vendingMachineState) throws Exception {
        return null;
    }

    @Override
    public void insertCoin(int currentDenomination, VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    @Override
    public VendingMachineState stateChangeButton(VendingMachineState vendingMachineState) {
        return new idleState();
    }

    @Override
    public VendingMachineState chooseProduct(VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    @Override
    public void refundAmount(VendingMachineState vendingMachineState) throws Exception {
        Iterator<ProductDto> itr = listOfProductDto.listIterator();
        while(itr.hasNext()) {
            if(itr.next().getItemDetails().equals(selectedProductDto.getProductEnum())) {
                itr.next().setQuantity(itr.next().getQuantity()-1);
                System.out.println("Quantity of : "+itr.next().getItemDetails()+"and new quantity is : "+itr.next().getQuantity());
            }
        }
       throw new Exception("There is some issue while refunding.Please contact customer care");


    }

    @Override
    public VendingMachineState dispenseProduct(VendingMachineState vendingMachineState) throws Exception {
            System.out.println("We have dispensed the product and the product is "+selectedProductDto.getProductEnum());
            vendingMachineState.refundAmount(vendingMachineState);
            return vendingMachineState.stateChangeButton(vendingMachineState);
    }
}
