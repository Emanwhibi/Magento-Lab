package magento;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Signup extends Parameters {

	private String generatedEmail; 
	
	@Test
	public void createAccount() {

		WebElement createAccount = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		createAccount.click();

		Random random = new Random();
		int randomIndex = random.nextInt(4);
		String[] firstNameList = { "Eman", "Amani", "Alaa", "Sona" };
		String[] lastNameList = { "Ibrahim", "Mohammed", "Ahmad", "Ward" };
		String firstName = firstNameList[randomIndex];
		String lastName = lastNameList[randomIndex];

		WebElement firstNameField = driver.findElement(By.id("firstname"));
		firstNameField.sendKeys(firstName);

		WebElement lastNameField = driver.findElement(By.id("lastname"));
		lastNameField.sendKeys(lastName);
