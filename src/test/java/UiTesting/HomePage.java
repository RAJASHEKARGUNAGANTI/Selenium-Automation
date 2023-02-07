package UiTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation2\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("disable-extensions");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://rajashekargunaganti.github.io/rythu_seva/");
        driver.findElementByXPath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a").click();
        driver.findElementById("Nitrogen").sendKeys("10");
        driver.findElementById("Phosphorous").sendKeys("12");
        driver.findElementById("Pottasium").sendKeys("18");
        WebElement dropdown = driver.findElement(By.id("crop"));
        Select dropdownSelect = new Select(dropdown);
        List<WebElement> selectOptions = dropdownSelect.getOptions();
        for (WebElement option : selectOptions){
            if(option.getText().equals("rice")){
                option.click();
                break;
            }
        }
        driver.findElementByXPath("/html/body/div[1]/form/div[5]/button").click();
    }
}
