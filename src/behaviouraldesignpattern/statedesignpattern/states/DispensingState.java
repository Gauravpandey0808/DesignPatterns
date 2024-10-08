package behaviouraldesignpattern.statedesignpattern.states;

import behaviouraldesignpattern.statedesignpattern.dto.ProductDto;
import behaviouraldesignpattern.statedesignpattern.dto.SelectedProductDto;

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
        while (itr.hasNext()) {
            ProductDto currentProduct = itr.next();

            if (currentProduct.getItemDetails().equals(selectedProductDto.getProductEnum())) {
                currentProduct.setQuantity(currentProduct.getQuantity() - 1);
                System.out.println("Bought item: " + currentProduct.getItemDetails() + " and new quantity is: " + currentProduct.getQuantity());
                System.out.println("Cost of : "+currentProduct.getItemDetails()+" is : "+currentProduct.getCost());
                System.out.println("Refunded amount: "+ (selectedProductDto.getCurrentTotalAmountInserted() - currentProduct.getCost()));
                System.out.println("Thanks for choosing us");
                return;
            }
        }
        throw new Exception("There is some issue while refunding. Please contact customer care");
    }


    @Override
    public VendingMachineState dispenseProduct(VendingMachineState vendingMachineState) throws Exception {
            vendingMachineState.refundAmount(vendingMachineState);
            return vendingMachineState.stateChangeButton(vendingMachineState);
    }
}
