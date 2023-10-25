package yuvaraj;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Signin {
	WebDriver driver;
	@Given("user navigate the webpage")
	public void user_navigate_the_webpage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");   
	}
	@When("user take the entire page srceenshot")
	public void user_take_the_entire_page_screenshot() throws IOException {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir")+"/Screenshots/fullscreenshot.png"));
	}
	@And("finnaly user get the entire screenshot of the webpage")
	public void finnaly_user_get_the_entire_screenshot_of_the_webpage() {
		System.out.println("user get the entire sreenshot of the webpage");
	}
	
	@And("user click on the signin button")
	public void user_click_on_the_signin_button() {
		driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")).click();
	}

	@When("user enter the mobile number {string}")
	public void user_enter_the_mobile_number(String string) {
		driver.findElement(By.id("ap_email")).sendKeys("6301793419");
	 
	}
	@And("user copy the mobile number page screenshot")
		public void user_copy_the_mobile_number_page_screenshot() throws IOException {
		File srcscreenshot = driver.findElement(By.className("a-spacing-small")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcscreenshot,new File(System.getProperty("user.dir")+"\\screenshot.png"));
		}
	@And("user take the password page screenshot")
	public void user_the_password_page_screenshot() throws IOException {
		File srcscreenshot = driver.findElement(By.id("ap_password")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcscreenshot,new File(System.getProperty("user.dir")+"\\yuvaraj.png."));	
		
	}
	@When("user click on the terms and condition link")
	public void user_click_on_the_terms_and_condition_link() {
		driver.findElement(By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Conditions of Use')]")).click();
		
	}
	@And("user navigate to the terms and conditions page")
	public void user_navigate_to_the_terms_and_conditions_page() {
		System.out.println("user navigate to the terms and condition page");
	}
	@And("click on the helpful information button")
	public void click_on_the_helpful_information_button() {
		driver.findElement(By.className("a-button-input")).click();
		driver.getTitle();
		
	}

	@When("user click on the continue button")
	public void user_click_on_the_continue_button() {
	    driver.findElement(By.id("continue")).click();
	}

	@When("user enter the password as {string}")
	public void user_enter_the_password_as(String string) {
	   driver.findElement(By.id("ap_password")).sendKeys("YUVAraj@143");
	   
	}
	@And("user click on the button")
		public void user_click_on_the_button(){
		driver.findElement(By.id("signInSubmit")).click();	
	}
	
	@When("user enter the invalid mobile number {string}")
	public void user_enter_the_invalid_mobile_number(String string) {
		driver.findElement(By.id("ap_email")).sendKeys("100000000");
	 
	}
	@When("user enter the invalid password as {string}")
	public void user_enter_the_invalid_password_as(String string) {
	   driver.findElement(By.id("ap_password")).sendKeys("vignesh00");
	   
	}
	@When("user without enter the mobile number {string}")
	public void user_enter_the_mobile_number1(String string) {
		driver.findElement(By.id("ap_email")).sendKeys("");
	 
	}

	@When("user without enter the password as {string}")
	public void user_enter_the_password_as1(String string) {
	   driver.findElement(By.id("ap_password")).sendKeys("");
	   
	}
	@When("user click on the privacy notice")
	public void user_click_on_the_privacy_notice() {
		driver.findElement(By.xpath("//div[@id='legalTextRow']//a[contains(text(),'Privacy Notice')]")).click();	
	}
	@And("user navigate to the privacy notice page")
	public void user_navigate_to_the_privacy_notice_page() {
		System.out.println("user navigate to the privacy notice page");
	}
	@And("user backward to the signin page")
	public void user_backward_to_the_signin_page() {
		driver.navigate().back();  
	}
	@When("click on the helpful information button No")
	public void click_on_the_helpful_information_button_no() {
		driver.findElement(By.xpath("//span[@id='a-autoid-1']//input[@type='submit']")).click();
	}
	@When("Please select what best describes the information")
	public void please_select_what_best_describes_the_information() {
		System.out.println("user navigate to the information page");
	 
	}
	@When("user click on the radiobutton")
	public void user_click_on_the_radiobutton() {
		driver.findElement(By.xpath("//fieldset[@class='a-spacing-base']//div[1]")).click();
	}
	@When("click on the summit button")
	public void click_on_the_summit_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[@id='a-autoid-2']//input[@type='submit']")).click();
		Thread.sleep(4000);
	}

	@When("finnaly display the thank you giving the feeback to use the information")
	public void finnaly_display_the_thank_you_giving_the_feeback_to_use_the_information() {
		driver.toString();
	}   
	@When("finally user navigate the Home page of the webpage")
	public void finally_user_navigate_the_home_page_of_the_webpage() {
		String actual_result=driver.getTitle();
		System.out.println(actual_result);
		String expected_result="Amazon.com. Spend less. Smile more.";
		if(actual_result==expected_result) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("title is not correct");
		}
	}	

}
