package behaviouraldesignpattern.statedesignpattern.enums;

public enum ProductEnum {

    PEPSI("001"),
    COCACOLA("002"),
    SODA("003"),
    WATER("004"),
    CHIPS("005"),
    SNEAKERS("006");

    private final String code ;

    ProductEnum(String code) {
        this.code=code;
    }

}
