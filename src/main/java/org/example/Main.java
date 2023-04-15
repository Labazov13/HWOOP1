package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("cheese", 300))
                .addProduct(new Product("wine", 500))
                .addProduct(new Product("water", 35))
                .addProduct(new Yogurt("Danone", 200, "sweet"))
                .addProduct(new Bread("Borodinskyi", 45, "black"))
                .addProduct(new Cofee("Jacobs", 349, "Strong"));
        System.out.println("Ваш список товаров: ");
        for (int i = 0; i < vm.getList().size(); i++) {
            System.out.println(vm.getList().get(i));
        }
        System.out.println("*************************************");
        Product found = vm.findProduct("water");
        System.out.println(found);
        Product sell = vm.sellProduct(found);
        System.out.println(vm.getAmount());
        System.out.println();
        System.out.println("Остаток продуктов: ");
        for (int i = 0; i < vm.getList().size(); i++) {
            System.out.println(vm.getList().get(i));
        }
        System.out.println("*************************************");
        try {
            Product prod = vm.sellProduct(vm.findProduct("Jacobs"));
            System.out.println(prod);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}