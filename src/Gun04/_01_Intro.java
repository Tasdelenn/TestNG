package Gun04;

import org.testng.annotations.*;

public class _01_Intro {

    /**

        @BeforeSuite
            @BeforeTest
                @BeforeGroups
                    @BeforeClass
                        @BeforeMethod
                            @Test
                            @Test
                        @AfterMethod
                    @AfterClass
                @AfterGroups
            @AfterTest
        @AfterSuite

    */

    @BeforeSuite
    void bSuit()
    {
        System.out.println("Before Suit");
    }

    @BeforeTest
    void bTest()
    {
        System.out.println("Before Test");
    }

    @BeforeGroups
    void bGroups()
    {
        System.out.println("Before Groups");
    }

    @BeforeClass
    void bClass()
    {
        System.out.println("Before Class");
    }

    @Test
    void TestIntro_1(){
        System.out.println("1. intro Test");
    }

    @Test
    void TestIntro_2(){
        System.out.println("2. intro Test");
    }

    @AfterMethod
    void aMetod(){
        System.out.println("after methodun");
    }

    @AfterClass
    void aClass(){
        System.out.println("after classın");
    }

    @AfterGroups
    void aGroups(){
        System.out.println("after grubun");
    }

    @AfterTest
    void aTest(){
        System.out.println("after testin");
    }

    @AfterSuite
    void aSuit(){
        System.out.println("after suitin");
    }


}

