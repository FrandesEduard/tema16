package org.fasttrack.tema16.ShopItem;

public class Electronics implements ShopItem {
    private String itemName;
    private int itemPrice;
    private Category itemCategory;

    public Electronics(String name, int price, Category category) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemCategory = category;
    }

    @Override
    public String name() {
        return itemName;
    }

    @Override
    public int price() {
        return itemPrice;
    }

    @Override
    public Category category() {
        return itemCategory;
    }
}
