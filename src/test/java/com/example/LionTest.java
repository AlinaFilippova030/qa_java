package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionTest {

    @Mock
    private Predator predator;

    private final String sex;
    private final boolean expectedHasMane;

    public LionTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void lionHasManeTest() throws Exception {
        Lion lion = new Lion(sex, predator);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void sexThrowsExceptionTest() throws Exception {
        new Lion("Не заполнен", predator);
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", predator);
        when(predator.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самка", predator);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(predator.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, lion.getFood());
    }
}