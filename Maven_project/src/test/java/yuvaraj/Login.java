package yuvaraj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@Given("give the login credreits")
	public void give_the_valid_credrencials() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");   
	}

@Given("user click on the login button")
public void user_click_on_the_login_button() {
	driver.findElement(By.linkText("Log in")).click();
}

@When("user gives the mobile as {string}")
public void user_gives_the_mobile_as(String string) {
	driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("6301793419");
}

@When("user click on the one time password button")
public void user_click_on_the_one_time_password_button() {
	driver.findElement(By.xpath("//button[@role='button' and @tabindex='0']")).click();
    
}
@Then("user transfor to home page")
	public void user_transfor_to_home_page() {
	System.out.println("user navigated to home page");
		
	}


}

