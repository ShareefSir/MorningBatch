package stepDefinatons;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WebDriverSingletonClass;

public class OangeHRM_StepDefination {

	WebDriver driver;

//	@Before
//	public void setUp() throws Exception {
//
//		Thread.sleep(5000);
//		WebDriverManager.chromedriver().setup();
//		driver = getDriver();
//
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//	}

	@Given("launch OrangeHRM login page")
	public void launch_orange_hrm_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

//	@When("Enter valid username and password and hit enter")
//	public void enter_valid_username_and_password_and_hit_enter(DataTable table) throws Exception {
//		Thread.sleep(7000);
//		List<List<String>> data = table.asLists();
//			driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//			driver.findElement(By.xpath("//*[@type='submit']")).click();
//	}

	@When("Enter valid username and password and hit enter")
	public void enter_valid_username_and_password_and_hit_enter(DataTable table) throws Exception {
		Thread.sleep(7000);

		List<Map<String, String>> data = table.asMaps();

		for (Map<String, String> val : data) {

			driver.findElement(By.name("username")).sendKeys(val.get("UserName"));
			driver.findElement(By.name("password")).sendKeys(val.get("Password"));
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		}
	}

	@Then("Verify OrangeHRM login success")
	public void verify_orange_hrm_login_success() throws Exception {

		Thread.sleep(7000);

		WebElement pim = driver.findElement(By.xpath("//h6[text()='PIM']"));

		Assert.assertEquals(true, pim.isDisplayed());

	}

	@When("Enter valid {string} and {string} and hit enter")
	public void enter_valid_and_and_hit_enter(String un, String pws) throws Exception {

		Thread.sleep(7000);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pws);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

	@Then("^close Browser$")
	public void close_Browser() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@When("^Click on My Info module$")
	public void Click_on_My_Info_module() {

		driver.findElement(By.xpath("//*[text()='My Info']")).click();
	}

	@Then("^verify My Info module should load$")
	public void verify_My_Info_module_should_load() {
		WebElement personalDetails = driver.findElement(By.xpath("//h6[text()='Personal Details']"));
		Assert.assertEquals(true, personalDetails.isDisplayed());
	}

//	@After
//	public void tearDown() {
//		driver.quit();
//	}

}
