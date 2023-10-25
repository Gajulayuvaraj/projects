package yuvaraj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {
	WebDriver driver;
	@Given("user give the valid credrencials")
	public void user_give_the_valid_credrencials() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");   
	}

@Given("user click the sign up button")
public void user_click_the_sign_up_button() {
	driver.findElement(By.linkText("Sign up")).click();
}

@When("user gives the fullname as {string} and emailid as {string}")
public void user_gives_the_fullname_as_and_emailid_as(String string, String string2) {
    driver.findElement(By.cssSelector("section[label='Full Name'] input[type='text']")).sendKeys("gajulayuvaraj");
    driver.findElement(By.cssSelector("section[label='Email'] input[type='text']")).sendKeys("gajulayuvaraj43@gmail.com");
}

@When("click on the check button")
public void click_on_the_check_button(){
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
}
@When("click to the signup button")
public void click_to_the_signup_button() {
	driver.findElement(By.xpath("//button[@role='button']")).click();
   
}
@When("user enter the otp as {string}")
public void user_enter_the_otp_as(String string) {
     driver.findElement(By.cssSelector("section[label='OTP'] input[type='text']")).sendKeys("RY3XU2");
}
@When("click on the otp button")
public void click_on_the_otp_button(){
	driver.findElement(By.xpath("//button[@tabindex=\"0\"]")).click();
}

@Then("user navigate to the login page")
public void user_navigate_to_the_login_page() {
	System.out.println("user navigated to login page");

}


}
