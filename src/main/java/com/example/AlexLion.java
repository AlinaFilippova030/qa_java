package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public  AlexLion(String sex, Predator predator) throws Exception {
        super(sex, predator);
    }

    public List<String> getFriends() throws Exception {
        return List.of("зебра Марти", "бегемотиха Глории", "жираф Мелман");
    }

    public String  getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

 @Override
    public int getKittens() {
        return 0;
    }

    public boolean doesHaveMane() {
        return true;
    }

    public List<String> getFood() throws Exception {
        return super.getFood();
    }
}
