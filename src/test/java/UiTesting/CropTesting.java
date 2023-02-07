package UiTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CropTesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation2\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--exited-extensions");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://rajashekargunaganti.github.io/rythu_seva/");
        driver.findElementByXPath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a").click();
        driver.findElementByXPath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a").click();
        driver.findElementById("Nitrogen").sendKeys("20");
        driver.findElementById("Phosphorous").sendKeys("10");
        driver.findElementById("Pottasium").sendKeys("10");
        driver.findElementById("ph").sendKeys("10");
        driver.findElementById("Rainfall").sendKeys("10");
        driver.findElementById("Temparature").sendKeys("10");
        driver.findElementById("Humidity").sendKeys("10");
        Thread.sleep(3000);
        driver.findElementByXPath("/html/body/div[2]/form/div[8]/button").click();
    }
}
