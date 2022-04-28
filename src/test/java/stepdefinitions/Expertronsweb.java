package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Expertronsweb {
	WebDriver driver;

	@Given("user enter valid mobile numberer")
	public void user_enter_valid_mobile_numberer() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://app.expertrons.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);

	}

	@When("user enter Generate otp")
	public void user_enter_Generate_otp() throws InterruptedException {
		Thread.sleep(2000);
		WebElement click = driver
				.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[1]/form/div[1]/div/div/input"));
		click.click();
		Thread.sleep(5000);
		click.sendKeys("9224698675");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("6769");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//WebElement click = driver
//.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div/img[2]"));
//click.click();
//Thread.sleep(2000);
//WebElement click2=driver.findElement(By.xpath("//input[@name='email'][@placeholder='Email ID']"));
//click2.sendKeys("ali.m@gmail.com");
//driver.findElement(By.xpath("//button[text()='Continue']")).click();7311
	}

	@Then("Expertrons home page will be displayed")
	public void expertrons_home_page_will_be_displayed() throws InterruptedException {
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Thread.sleep(2000);
		Assert.assertEquals(ActualTitle, "Expertrons");
	}

}