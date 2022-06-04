package ru.skillfactory.qajava;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static int sumNumbers(int arg1, int arg2){
        return arg1 + arg2;
    }


    public void currentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Before class");
        currentTime();
    }
    @AfterClass
    void afterClass(){
        System.out.println("AfterClass");
        currentTime();
    }
    @DataProvider(name = "sumProvider")
    Object[][] dataProvider(){
        return new Object[][]{
                {10, 30, 40},
                {0, 0, 0},
                {-10, 10, 0}
        };
    }
    @Test(dataProvider = "sumProvider")
    void testSum(int arg1 , int arg2, int expected){
        int sum = sumNumbers(arg1, arg2);
        System.out.println(sum);
        assertEquals(sum, expected);

    }

}
