package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    private Predator predator;
    private AlexLion alexLion;

 @Before
 public void setUo() throws Exception {
     alexLion = new AlexLion("Самец", predator);
 }


    @Test
    public void alexGetFriendsTest() throws Exception {
        List<String> expectedFriends = List.of("зебра Марти", "бегемотиха Глории", "жираф Мелман");
        Assert.assertEquals(expectedFriends, alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        Assert.assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }


    @Test
    public void getKittensTest() throws Exception {
        assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(predator.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, alexLion.getFood());
    }

    @Test
    public void doesHaveManeTest() {
        Assert.assertTrue(alexLion.doesHaveMane());
    }

}
