package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("User is on LoginPage");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user entes username and password")
	public void user_entes_username_and_password() {
		System.out.println("User enter username and password");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("User is clicking on login button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();  
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
