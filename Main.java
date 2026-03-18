package UserRegistration_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com");

        RegistrationMethods register = new RegistrationMethods(driver);

        register.selectRegister();
        register.selectGender();
        register.enterFirstName("Piyush");
        register.enterLastName("Bhat");
        register.enterEmail("piyushbhat@gmil.com");
        register.enterPassword("Piyush12345");
        register.confirmPassword("Piyush12345");
        register.register();

        driver.wait(2000);
//        Thread.sleep(2000);
        System.out.println("Registration Successful");
        driver.quit();
    }
}
