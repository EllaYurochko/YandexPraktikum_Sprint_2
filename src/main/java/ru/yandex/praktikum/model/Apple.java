package ru.yandex.praktikum.model;


import static ru.yandex.praktikum.model.constants.Colour.RED;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT;
import static ru.yandex.praktikum.model.constants.Discount.NODISCOUNT;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        return colour.equals(RED) ? DISCOUNT : NODISCOUNT;
    }
}
