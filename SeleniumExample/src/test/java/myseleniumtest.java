// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.*;

public class myseleniumtest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void translatortogoogle() throws InterruptedException {
        /*
        driver.get("https://www.hongik.ac.kr/index.do");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.linkText("대학/대학원")).click();
        driver.findElement(By.linkText("컴퓨터공학과")).click();
        driver.findElement(By.linkText("대학소개")).click();

        driver.navigate().to("https://www.google.com");
        Thread.sleep(1000);
        driver.get("https://www.selenium.dev/"); // driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(1000);

        driver.findElement((By.name("q"))).sendKeys("Hongik University", Keys.ENTER);
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(1000);

        WebElement button = driver.findElement(By.name("btnI"));
        js.executeScript("arguments[0].click();", button); // javascript 의 event handler 는 event target object 를
        // 첫 번째 argument 로 전달 받음므로 .arguments[0].click() 은 target object 에 click() 메쏘드를 실행시킨 것. 따라서 예제에선
        // button 을 click() 하는 것을 simulate 함
        Thread.sleep(3000);
    }

         */
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.findElement((By.name("q"))).sendKeys("셀레니움", Keys.ENTER);
        Thread.sleep(3000);

        driver.navigate().back();
        driver.manage().window().setSize(new Dimension(1552, 832));
        Thread.sleep(3000);

        driver.findElement((By.name("q"))).sendKeys("유튜브", Keys.ENTER);
        Thread.sleep(3000);

        driver.get("https://www.youtube.com");
        Thread.sleep(3000);

        driver.close();
    }
}