package Gun03;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3-En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.
 */

public class _02_AddressFunctionality extends GenelWebDriver {

    @Test()
    void addressBook(){

        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAddress = driver.findElement(By.linkText("New Address"));
        newAddress.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement company = driver.findElement(By.name("company"));
        WebElement address_1 = driver.findElement(By.name("address_1"));
        WebElement address_2 = driver.findElement(By.name("address_2"));
        WebElement city = driver.findElement(By.name("city"));
        WebElement postcode = driver.findElement(By.name("postcode"));

        firstName.sendKeys("Mehmet");
        lastName.sendKeys("Tarçın");
        company.sendKeys("Techno Corp.");
        address_1.sendKeys("Mavi mh. Yeşil sk.");
        address_2.sendKeys("Fincancılar Yokuşu No:5 Tarsus");
        city.sendKeys("Mersin");
        postcode.sendKeys("444555");

        WebElement country=driver.findElement(By.id("input-country"));
        Select countryS=new Select(country);
        countryS.selectByVisibleText("Turkey");

        WebElement State=driver.findElement(By.id("input-zone"));
        Select state=new Select(State);
        state.selectByVisibleText("Samsun");

        /**
        WebElement country = driver.findElement(By.id("input-country"));
        Select countryS = new Select(country);
        countryS.selectByIndex(10);



        //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("input-zone"),"--- Please Select ---"));

        WebElement State = driver.findElement(By.id("input-zone"));
        Select stateS = new Select(State);
        System.out.println(stateS.getOptions().size());

         */

        WebElement defaultAddress=driver.findElement(By.cssSelector("input[value='1']"));
        defaultAddress.click();

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        WebElement edit = driver.findElement(By.linkText("Edit"));
        edit.click();

    }
}
