import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LetsWriteTest {
 WebDriver driver;
 WebDriverWait wait;

   String URL ="https://www.saucedemo.com/";

    @Before
    public void login() {

        System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

    }

    @Test
     /* login, sort and verify
        login with --> standard_user
        wait for page to load or any element then assert and verify that user successfully logged in
        sort the list
        verify the list is sorted correctly
    * */
    public void verifyIsLoginSuccessful() {

   }

    @Test
    /*
    Add items to cart and if any items fails to get added in cart print the name
    as an example we have 6 items in inventory,
    then only 2 items fails to get added in cart then print the name of those 2 items
    * */
    public void addItemsToCartVerify() {

    }
 
      @Test
    /*
open a new window and complete shopping flow, (select +buy +verify +pay )
 https://demo.midtrans.com/
    * */
    public void addItemsToCartVerify() {

    }

    
}
