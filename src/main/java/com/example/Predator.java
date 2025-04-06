package com.example;

import java.util.List;

public interface Predator {

    List<String> eatMeat() throws Exception;
    List<String> notEatMeat() throws Exception;
    int getKittens();
    List<String> getFood(String type) throws Exception;
}
