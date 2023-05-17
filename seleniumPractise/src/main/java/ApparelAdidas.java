import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class FaceBook {
    protected static WebDriver driver;
    static Timestamp timestamp =new Timestamp(System.currentTimeMillis());
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static Long timestamp(){
        Timestamp timestamp =new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    @BeforeMethod
    public static void openBrowser(){
        driver=new ChromeDriver();
        //type URL
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public static void closeBrowser(){
        driver.close();
    }
@Test
    public static void verifyUserShoulbeAbbleToAdidasShoesInCart(){
        //click on apparel
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
        //click on shoes
       clickOnElement(By.xpath("//img[@alt=\"Picture for category Shoes\"]"));
       //click on nike photo
       clickOnElement(By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[1]"));
       // select size
       clickOnElement(By.id("product_attribute_label_6"));
       //chose appropriat size
       typeText(By.id("product_attribute_input_7"));





}


}
