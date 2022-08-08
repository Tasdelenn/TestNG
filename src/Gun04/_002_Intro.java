package Gun04;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _002_Intro {

    @Test
    void Test1(){
        System.out.println("Test 1");
    }


    @Test
    void Test2(){
        System.out.println("Test 2");
    }

    @BeforeTest
    void aTest(){
        System.out.println("Test1 de de Test2 de de before test varsa hangisini çalıştırır hangi sırada? Bu intro2 cTest");
    }

}

