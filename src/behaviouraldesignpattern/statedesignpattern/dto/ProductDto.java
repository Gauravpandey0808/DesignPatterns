package behaviouraldesignpattern.statedesignpattern.dto;


import behaviouraldesignpattern.statedesignpattern.enums.ProductEnum;

public class ProductDto {

    private ProductEnum ItemDetails;
    private int quantity;
    private  int cost;

    public ProductDto(ProductEnum itemDetails ,int quantity,int cost) {
        this.ItemDetails = itemDetails;
        this.quantity = quantity;
        this.cost = cost;
    }

    public ProductEnum getItemDetails() {
        return ItemDetails;
    }

    public void setItemDetails(ProductEnum itemDetails) {
        ItemDetails = itemDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
