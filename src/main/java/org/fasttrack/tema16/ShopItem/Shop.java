package org.fasttrack.tema16.ShopItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Shop<T extends ShopItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> findByCategory(Category category) {
        return items.stream()
                .filter(item -> item.category() == category)
                .collect(Collectors.toList());
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        return items.stream()
                .filter(item -> item.price() <= maxPrice)
                .collect(Collectors.toList());
    }

    public Optional<T> findByName(String name) {
        return items.stream()
                .filter(item -> item.name().equals(name))
                .findFirst();
    }

    public Optional<T> removeItem(String name) {
        Optional<T> itemToRemove = findByName(name);
        itemToRemove.ifPresent(items::remove);
        return itemToRemove;
    }

}
