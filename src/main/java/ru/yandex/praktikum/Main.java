package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.service.ShoppingCart;

import static ru.yandex.praktikum.model.constants.Colour.GREEN;
import static ru.yandex.praktikum.model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, RED);
        Food greenApple = new Apple(8, 60, GREEN);

        Food[] foods = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.sumAllFoodsNotDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.sumAllFoodsDiscount());
        System.out.println("Общая сумма вегетерианских товаров без скидки: " + shoppingCart.sumAllFoodsisVegetarian());
    }


}


/*

 */