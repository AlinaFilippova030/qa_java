package com.example;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
        Predator feeline = new Feline();
        Lion lion = new  Lion("Самец", feeline);
        System.out.println(lion.doesHaveMane());  // true
        System.out.println(lion.getKittens());
        System.out.println(lion.getFood());  // Метод, который может выбросить Exception// 1
    } catch (Exception e) {
        System.err.println("Произошла ошибка: " + e.getMessage());
    }
    }
}
