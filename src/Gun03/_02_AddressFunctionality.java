package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

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

        wait.until(ExpectedConditions.elementToBeClickable(country));  // ülke bi anlık tıklanamaz oluyo dikkat!

        // wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle

        WebElement State=driver.findElement(By.id("input-zone"));
        Select state=new Select(State);
        state.selectByVisibleText("Manisa");

        /**
        WebElement country = driver.findElement(By.id("input-country"));
        Select countryS = new Select(country);
        countryS.selectByIndex(10);

        //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("input-zone"),"--- Please Select ---"));

        WebElement State = driver.findElement(By.id("input-zone"));
        Select stateS = new Select(State);
        System.out.println(stateS.getOptions().size());
         */

        //WebElement defaultAddress = driver.findElement(By.cssSelector("label [name='default'][value='1']"));
        WebElement defaultAddress=driver.findElement(By.cssSelector("input[value='1']"));
        defaultAddress.click();

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();

        WebElement edit = driver.findElement(By.linkText("Edit"));
        edit.click();
    }

    @Test
    void editAddress()
    {
        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll = driver.findElements(By.linkText("Edit"));
        WebElement sonEdit = editAll.get(editAll.size()-1);
        System.out.println("editAll = " + editAll.size());
        sonEdit.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Hasan");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("Yılmaz");

        WebElement ctn = driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();

    }

    @Test(dependsOnMethods={"editAddress"})
    void deleteAddress()
    {

        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> deleteAll = driver.findElements(By.linkText("Delete"));
        WebElement sonDelete = deleteAll.get(deleteAll.size()-2);  // Silinmeye çalışana default address kontrolü yap!!!
        System.out.println("editAll = " + deleteAll.size());
        sonDelete.click();

        Tools.successMessageValidation();

    }
}
