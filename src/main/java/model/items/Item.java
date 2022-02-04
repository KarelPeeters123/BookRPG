package model.items;

public abstract class Item {
    private String name;
    private String description;
    private int buyPrice;
    private int sellPrice;

    public Item(String name, String description, int buyPrice, int sellPrice) {
        this.name = name;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
