package ru.yandex.praktikum.model;

public interface Discountable {
    public default double getDiscount() {
        return 0;
    }
}