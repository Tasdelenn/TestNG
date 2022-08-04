package Gun03;

import Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.

 */

public class _01_Dependency {

    @Test
    void startCar(){
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("car drived");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar", "driveCar"})
    void parkCar(){
        System.out.println("car parked");
    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)
    void stopCar(){
        System.out.println("car stoped");
    }
}