package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double sumAllFoodsNotDiscount() {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            sum += foods[i].getAmount() * foods[i].getPrice();
        }
        return sum;
    }

    public double sumAllFoodsDiscount() {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            sum += (foods[i].getAmount() * foods[i].getPrice()) - (foods[i].getAmount() * foods[i].getPrice()) * foods[i].getDiscount();
        }
        return sum;
    }

    public double sumAllFoodsisVegetarian() {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                sum += foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sum;
    }

}

