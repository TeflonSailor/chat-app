package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginTest {

@Test
public void openChatApp() {

System.setProperty("webdriver.edge.driver",
"C:\\WebDriver\\msedgedriver.exe");

WebDriver driver = new EdgeDriver();

driver.get("http://localhost:5173");

System.out.println(driver.getTitle());

driver.quit();

}

}
