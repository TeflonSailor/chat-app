package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    @Test
    public void openChatApp() {

        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("http://localhost:3000");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}