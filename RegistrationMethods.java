package UserRegistration_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationMethods {

    WebDriver driver;

    public RegistrationMethods(WebDriver driver) {
        this.driver = driver;
    }

    By register = By.className("ico-register");
    By gender = By.id("gender-male");
    By first_name = By.id("FirstName");
    By last_name = By.name("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirm_password = By.id("ConfirmPassword");
    By registration = By.id("register-button");


    public void selectRegister(){
        driver.findElement(register).click();
    }
    public void selectGender(){
        driver.findElement(gender).click();
    }

    public void enterFirstName(String fname){
        driver.findElement(first_name).sendKeys(fname);
    }

    public void enterLastName(String lname){
        driver.findElement(last_name).sendKeys(lname);
    }

    public void enterEmail(String useremail){
        driver.findElement(email).sendKeys(useremail);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void confirmPassword(String cpass){
        driver.findElement(confirm_password).sendKeys(cpass);
    }

    public void register(){
        driver.findElement(registration).click();
    }


}
