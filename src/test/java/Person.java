import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Person {
    public static boolean isTeenager(int age, int age2, int age3) {
        boolean result;
        if(age < 19) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("Before class");
    }
    @AfterClass
    void afterClass() {
        System.out.println("AfterClass");
    }
    @DataProvider(name = "Teenager")
    Object[][] dataProvider() {
        return new Object[][]{
                {1, 19, 22},

        };
    }
    @Test(dataProvider = "teenager")
    public void agebool(int age1 , int age2, int age3){
            boolean result = Person.isTeenager(age1, age2, age3);

        System.out.println(result);
    }



}
