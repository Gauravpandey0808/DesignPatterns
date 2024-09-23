package statedesignpattern.dto;

import statedesignpattern.enums.ProductEnum;

public class SelectedProductDto {

    private ProductEnum productEnum;

    private int priceOfTheProduct;
    private int currentTotalAmountInserted=0;

    public ProductEnum getProductEnum() {
        return productEnum;
    }

    public void setProductEnum(ProductEnum productEnum) {
        this.productEnum = productEnum;
    }

    public int getPriceOfTheProduct() {
        return priceOfTheProduct;
    }

    public void setPriceOfTheProduct(int priceOfTheProduct) {
        this.priceOfTheProduct = priceOfTheProduct;
    }

    public int getCurrentTotalAmountInserted() {
        return currentTotalAmountInserted;
    }

    public void setCurrentTotalAmountInserted(int currentTotalAmountInserted) {
        this.currentTotalAmountInserted = currentTotalAmountInserted;
    }

}
