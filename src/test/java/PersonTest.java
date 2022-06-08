import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertTrue;

public class PersonTest {


    public void currentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("Before class");
        currentTime();
    }

    @AfterClass
    void afterClass() {
        System.out.println("AfterClass");
        currentTime();
    }


    @Test()
    void isTeenager (){
        boolean result = Person.isTeenager(13);
        System.out.println(result);
        assertTrue(result);
    }
}

