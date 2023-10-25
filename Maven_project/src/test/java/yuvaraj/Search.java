package yuvaraj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
	WebDriver driver;
	@Given("I got navigated to home page")
	public void i_got_navigated_to_home_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	@When("I enter the valid product like product as {string}")
	public void i_enter_the_valid_product_like_product_as(String string) {
		driver.findElement(By.name("q")).sendKeys("laptops");
		 
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		driver.findElement(By.xpath("//descendant::button")).click();
	

	}

	@Then("valid product should got displayed in search results")
	public void valid_product_should_got_displayed_in_search_results() {
	    String uv = driver.findElement(By.xpath("//span[text()=\"CATEGORIES\"]")).getText();
	    System.out.println(uv);
	}

}
