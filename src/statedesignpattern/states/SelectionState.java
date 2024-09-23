package statedesignpattern.states;

import statedesignpattern.ProductStock;
import statedesignpattern.dto.ProductDto;
import statedesignpattern.dto.SelectedProductDto;
import statedesignpattern.enums.ProductEnum;

import java.util.List;
import java.util.Scanner;

public class SelectionState  implements VendingMachineState {

    private final SelectedProductDto selectedProductDto;
    private final ProductStock productStock = new ProductStock();
    List<ProductDto> listOfProductDto = productStock.getCurrentStock();

    public SelectionState(SelectedProductDto selectedProductDto) {
        this.selectedProductDto = selectedProductDto;
    }

    @Override
    public VendingMachineState startMachine(VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    @Override
    public void insertCoin(int currentDenomination, VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    @Override
    public VendingMachineState stateChangeButton(VendingMachineState vendingMachineState) {
        return new DispensingState(selectedProductDto,listOfProductDto);
    }


    @Override
    public VendingMachineState chooseProduct(VendingMachineState vendingMachineState) throws Exception {
        try{
            ProductEnum productName = getProductEnumFromCustomerInput();
            selectedProductDto.setProductEnum(productName);
            selectedProductDto.setPriceOfTheProduct(getProductPrice(listOfProductDto,productName));
        } catch(Exception e) {
            refundAmount(vendingMachineState);
        }
        return vendingMachineState.stateChangeButton(vendingMachineState);
    }

    @Override
    public void refundAmount(VendingMachineState vendingMachineState) throws Exception {
        throw new Exception("Refunded amount is "+selectedProductDto.getCurrentTotalAmountInserted());
    }

    @Override
    public VendingMachineState dispenseProduct(VendingMachineState vendingMachineState)  throws Exception {
        throw new Exception("These functions are not allowed in the currentState");
    }

    private ProductEnum getProductEnumFromCustomerInput() throws Exception {
        System.out.println("""
                Select 001 for Pepsi\s
                Select 002 for CocaCola\s
                Select 003 for Soda\s
                Select 004 for Water\s
                Select 005 for Chips\s
                Select 006 for Sneakers
                """);
        Scanner sc = new Scanner(System.in);
        String selected = sc.next();

        return switch (selected) {
            case "001" -> ProductEnum.PEPSI;
            case "002" -> ProductEnum.COCACOLA;
            case "003" -> ProductEnum.SODA;
            case "004" -> ProductEnum.WATER;
            case "005" -> ProductEnum.CHIPS;
            case "006" -> ProductEnum.SNEAKERS;
            default -> throw new Exception("Selected wrong item ");
        };

    }

    private Integer getProductPrice(List<ProductDto> productStock, ProductEnum productName) throws Exception {
        for(ProductDto productDto : productStock) {
            if(productDto.getItemDetails().equals(productName) && productDto.getQuantity() > 0) {
                return productDto.getCost();
            }
        }
        throw new Exception("The product is out of stock");
    }


}
