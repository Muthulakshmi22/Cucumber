package org.stepdefinition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
public class Customer {
	static WebDriver driver;
	@Given("open the telecom home page")
	public void open_the_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaVenkat\\eclipse-workspace\\Cucu\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/telecom/");
        driver.manage().window().maximize();}
	@Given("click add customer")
	public void click_add_customer() {
		driver.findElement(By.xpath("(//a[@href='addcustomer.php'])[1]")).click();
		driver.findElement(By.xpath("//label[@for='done']")).click();}
	@When("fill the detail")
	public void fill_the_detail(DataTable dataTable) {
		List<String> cmdetails = dataTable.asList(String.class);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cmdetails.get(0));
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(cmdetails.get(1));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cmdetails.get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cmdetails.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cmdetails.get(4));}
	@When("click submit")
	public void click_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();}
	@Then("c the cm id")
	public void c_the_cm_id() {
		driver.findElement(By.xpath("(//td[@align='center'])[1]")).isDisplayed();
		Assert.assertTrue(true);}
	@When("fill the details")
	public void fill_the_details(DataTable dataTables) {
		Map<String, String> cm = dataTables.asMap(String.class, String.class);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cm.get("Fname"));
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(cm.get("Lname"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cm.get("email"));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cm.get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(cm.get("phone"));}
	@When("click submit button")
	public void click_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();}
	@Then("check the cm id")
	public void check_the_cm_id() {
		driver.findElement(By.xpath("(//td[@align='center'])[1]")).isDisplayed();
		Assert.assertTrue(true);	}
	@When("fills the detail")
	public void fills_the_detail() {
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ramya");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("venkat");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("coimbatore");
		driver.findElement(By.id("telephoneno")).sendKeys("9876543210");	}
	@When("click the submit button")
	public void click_the_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();}
	@Then("cm id will b created")
	public void cm_id_will_b_created() {
		driver.findElement(By.xpath("(//td[@align='center'])[1]")).isDisplayed();
		Assert.assertTrue(true);}
}
