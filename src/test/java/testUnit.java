import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class testUnit {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1980, 1020));
    }

    @Test
    public void autorizationAdmin(){
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    public void adminMenu() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Menu
        driver.findElement(By.xpath("//span[text()='Appearence']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Template']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Logotype']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Catalog']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Product Groups']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Option Groups']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Manufacturers']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Suppliers']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Delivery Statuses']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Sold Out Statuses']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Quantity Units']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='CSV Import/Export']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Countries']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Currencies']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Customers']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='CSV Import/Export']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Newsletter']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Geo Zones']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Languages']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Storage Encoding']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Modules']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Background Jobs']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Customer']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Shipping']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Payment']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Order Total']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Order Success']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Order Action']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Orders']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Order Statuses']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Pages']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Reports']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Monthly Sales']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Most Sold Products']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Most Shopping Customers']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Settings']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Store Info']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Defaults']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='General']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Listings']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Images']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Checkout']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Advanced']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Security']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Slides']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Tax']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Tax Classes']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Tax Rates']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Tax Rates']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Translations']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Search Translations']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Scan Files']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='CSV Import/Export']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Users']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='vQmods']/ancestor::a")).click();
        driver.findElement(By.xpath("//h1")).isDisplayed();


    }


    @After
    public void exitDriver(){
        driver.quit();
    }
}
