package org.fasttrack;

import org.fasttrack.tema16.ShopItem.*;
import org.fasttrack.tema16.recursivitate.Methods;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //ex1
        Methods sumEv = new Methods();
        System.out.println(sumEv.sumOfFirstEvenIntegers(5));
        System.out.println(sumEv.sumOfDigits(12345));
        System.out.println(sumEv.fibonacci(7));
        //ex2
        Shop<Clothes> clothesShop = new Shop<>();
        Shop<Fruits> fruitsShop = new Shop<>();
        Shop<Electronics> electronicsShop = new Shop<>();

        electronicsShop.addItem(new Electronics("PC", 4800, Category.REFURBISHED));
        clothesShop.addItem(new Clothes("Hoodie", 120, Category.ON_SALE));
        fruitsShop.addItem(new Fruits("Orange", 2, Category.NEW));

        List<Clothes> onSaleClothes = clothesShop.findByCategory(Category.ON_SALE);
        System.out.println(onSaleClothes);
        Optional<Fruits> orange = fruitsShop.findByName("Orange");
        System.out.println(orange);

    }
}
