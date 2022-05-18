package com.javabasics.essentials;

import java.util.Optional;

public class NullPointer {
    public static void main(String[] args) {
        String brand = "Apple";
//        Optional.empty(); // the Optional is empty or not?
//        Optional.of(); // when you know that the obj is not null
//        Optional.ofNullable(); // 用於不確定是否為null時，when you don't know whether the obj is null
        String brandName = Optional.ofNullable(brand)
//                .orElse("Sony");
                .map(String::toUpperCase)
                    .orElseGet(()->{
                        // logic
                        return "Sony";
                    });
        System.out.println(brandName);
    }
}
