package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {


    @Mock
    private Feline predator;
    private Cat cat;

@Before
public void init() {
    cat = new Cat(predator);
}

    @Test
    public void getCatSoundTest() {
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catEatMeatTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, cat.getFood());
    }
}


