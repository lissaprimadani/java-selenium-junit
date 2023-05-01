package WebAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;

public class test {
    //Contoh Sederhana Memakai J-Unit//

    private static WebDriver driver;

    @Test
    public void OpenGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        String pageTitle = driver.getTitle();
        Assert.assertEquals("Google", pageTitle);
        System.out.println("Test Open Google Passed");
        driver.quit();
    }

    @Test
    public void InvalidLoginLinkedIn(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/");
        //Try this for waiting time / timesleep

        try {
            //program akan berhenti selama 2 detik
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@autocomplete='username']")).sendKeys("rendiardinata2@gmail.com");
        driver.findElement(By.xpath("//*[@autocomplete='current-password']")).sendKeys("Phi202738@");
        driver.findElement(By.xpath("//*[@data-id='sign-in-form__submit-btn']")).click();
        //Try this for waiting time / timesleep
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualInvalid = driver.findElement(By.xpath("//*[@class='header__content__heading ']")).getText();
        String expectedInvalid = "Sign in";
        Assert.assertEquals(actualInvalid, expectedInvalid);
        driver.quit();
    }
}
