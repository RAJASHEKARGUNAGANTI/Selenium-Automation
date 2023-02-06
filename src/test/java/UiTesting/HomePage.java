package UiTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation2\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("disable-extensions");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://rajashekargunaganti.github.io/rythu_seva/");
    }
}
