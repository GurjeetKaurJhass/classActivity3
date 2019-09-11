import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

	
	WebDriver driver;



	@Before

	public void setUp() throws Exception {

		

		 System.setProperty("webdriver.chrome.driver","/Users/gurjeet/Desktop/chromedriver");

		 driver = new ChromeDriver();


		// 2. Enter the website you want to go to

		String baseUrl = "https://www.mcdonalds.com";

	

		// 3. Open Chrome and go to the base url;

		driver.get(baseUrl);

	}

	

	



	@After

	public void tearDown() throws Exception {

	}

	

	//@Test

//	public void testMCD1()

//	{

//		WebElement heading = driver.findElement(By.cssSelector("h2.click-before-outline"));

//		String headingText = heading.getText();

//		System.out.println(headingText);

//		String expectedResult ="Subscribe to My McD’s®";

//		assertEquals(expectedResult,headingText);

//	}



	@Test

	public void testcase1() {

		// 4a. Find the box

				WebElement usernameBox = driver.findElement(By.id("firstname2"));

				String actualusernameBox = usernameBox.getText();

				assertEquals("gurjeet", actualusernameBox);

				// 4b. Put the user name in there



				

				

				// 5. Enter a password

				// ---------------------

				// 5a. Find the password box

				WebElement passwordBox = driver.findElement(By.id("email2"));

				String actualpassBox = usernameBox.getText();

				assertEquals("gurjit.babrah@gmail.com", actualpassBox);

				

				

				

				// 5b. Put the password in there

			

				WebElement postalCode = driver.findElement(By.id("postalcode2"));

				String actualpostalCodeBox = usernameBox.getText();

				assertEquals("L6Y", actualpostalCodeBox);

				

			

				// 5b. Put the password in there



				// 6. Press the login button

				// ---------------------

				// 6a. Find the login button

				WebElement loginButton = driver.findElement(By.id("g-recaptcha-btn-2"));

				// 6b. Click the button

				loginButton.click();

			

	}

	



	@Test

	public void testCase2() {

		

		WebElement  fname = driver.findElement(By.id("firstname2"));

		fname.sendKeys("Gurjeet");

		 String actualFirstName =fname.getText();

			assertEquals("gurjeet",actualFirstName);



			

		WebElement  emailAdd = driver.findElement(By.id("email2"));

		emailAdd.sendKeys("gurjeet.kaur@gmail.com");

		String actualemail = emailAdd.getText();



		 assertEquals("gurjeet.kaur@gmail.com",actualemail );



		WebElement  postal = driver.findElement(By.id("postalcode2"));

		postal.sendKeys("L6R");

		String actualCode = postal.getText();



		assertEquals("LYR",actualCode);



		 



		

		

		WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));

		subscribeButton.click();

		

		

		

		}

	


}
