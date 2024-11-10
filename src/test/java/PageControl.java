import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class PageControl extends TestBeforeAfter{
    @Test
    public void test () throws InterruptedException {
        driver.get("https://www.tamadres.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='Close']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Devam Et']")).click();

        WebElement logo = driver.findElement(By.xpath("//*[@class='logo']"));
        Assert.assertTrue(logo.isDisplayed());

        WebElement kategoriler = driver.findElement(By.xpath("//*[@class='menu-item__link d-flex align-items-center']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(kategoriler).perform();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(text(),'MEB Onaylı 100 Temel Eser')]")).click();

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");

        driver.findElement(By.xpath("//ol[2]//li[2]//a[1]")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1800)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > main:nth-child(4) > div:nth-child(1) > main:nth-child(6) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ol:nth-child(10) > li:nth-child(4) > a:nth-child(1)")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1800)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > main:nth-child(4) > div:nth-child(1) > main:nth-child(6) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ol:nth-child(10) > li:nth-child(5) > a:nth-child(1)")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1900)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > main:nth-child(4) > div:nth-child(1) > main:nth-child(6) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ol:nth-child(10) > li:nth-child(6) > a:nth-child(1)")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");


    }
}
