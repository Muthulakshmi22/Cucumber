package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tariff {
	static WebDriver driver;
	@Given("The Telecom page should be displayed")
	public void the_Telecom_page_should_be_displayed() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\Cucumberr\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1]")).click();
	}

	@When("Fill the all the Tariff Plan{string},{string},{string},{string},{string},{string},{string}")
	public void fill_the_all_the_Tariff_Plan(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(string);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(string2);
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(string3);
	driver.findElement(By.xpath("//input[@name='sms_pack']")).sendKeys(string4);
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(string5);
	driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(string6);
	driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(string7);
	
	
	}

	@Then("Submit the application")
	public void submit_the_application() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}


}
