package com.cucumber.bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;

	@Given("Open any browser")
	public void open_any_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Go to application with link")
	public void go_to_application_with_link() {

		driver.get("file:///Users/sattautsho/Desktop/SmartTech/SmartTech%20Online%20Banking.html");
	}

	@When("put valid user")
	public void put_valid_user() {

		driver.findElement(By.xpath("//*[@id ='username']")).sendKeys("Batch44");
	}

	@When("put valid password")
	public void put_valid_password() {

		driver.findElement(By.xpath("//*[@id ='password']")).sendKeys("student123@");

	}

	@When("click login button")
	public void click_login_button() {

		driver.findElement(By.xpath("//*[@value ='Login']")).click();

	}

	@Then("login should pass & logout button should there")
	public void login_should_pass_logout_button_should_there() {

		Boolean status = driver.findElement(By.xpath("//*[@id ='logoutButton']")).isDisplayed();

		System.out.println("Log out button there or not = " + status);

		driver.quit();
	}

	@When("put invalid user")
	public void put_invalid_user() {

		driver.findElement(By.xpath("//*[@id ='username']")).sendKeys("Utsho");

	}

	@When("put invalid password")
	public void put_invalid_password() {

		driver.findElement(By.xpath("//*[@id ='password']")).sendKeys("newyork");

	}

	@Then("login should failed & no logout button  there")
	public void login_should_failed_no_logout_button_there() {

		try {
			Boolean status = driver.findElement(By.xpath("//*[@id ='logoutButton']")).isDisplayed();
			System.out.println("Log out button there or not = " + status);
		} catch (Exception e) {

		}
		driver.quit();

	}

	@When("put null user")
	public void put_null_user() {

		driver.findElement(By.xpath("//*[@id ='username']")).sendKeys("");

	}

	@When("put null password")
	public void put_null_password() {

		driver.findElement(By.xpath("//*[@id ='password']")).sendKeys("");

	}

}
