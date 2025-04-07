package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private Feline feline = new Feline();

    @Test
    public void predatorEatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensCountTest() {
        Assert.assertEquals(3, feline.getKittens(3));
    }
}



