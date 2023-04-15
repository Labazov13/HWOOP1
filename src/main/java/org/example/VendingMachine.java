package org.example;

import java.util.ArrayList;
import java.util.List;
public class VendingMachine {
    List<Product> list = new ArrayList<>();
    private int amount = 0;
    public VendingMachine addProduct(Product product) {
        list.add(product);
        return this;

    }
    public List<Product> getList() {
        return list;
    }
    public Product findProduct(String find) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(find)) {
                return getList().get(i);
            }
        }
        return null;
    }
    public Product sellProduct(Product product) {
        try {
            Product sellProduct = findProduct(product.getName());
            getList().remove(sellProduct);
            amount += sellProduct.getCost();
            return sellProduct;
        } catch (Exception e) {
            throw new RuntimeException("Not found");
        }
    }

    public int getAmount() {
        return amount;
    }
}
