package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public  AlexLion(String sex, Feline feline) throws Exception {
        super(sex, feline);
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

}
