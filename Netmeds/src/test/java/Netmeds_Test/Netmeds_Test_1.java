package Netmeds_Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Netmeds_PageClass.Netmeds_Page1;
import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Test_1 extends Netmeds_Testbase{
	//Object of Page Class
	Netmeds_Page1 netmeds_page1;
		
	//Invoking Browser
	@BeforeClass
	public void launchWebsite() throws IOException {
		initialize();
		netmeds_page1 =  new Netmeds_Page1();
	}
	
	
	
	//Visibility of logo
  @Test(priority=1)
  public void Logo_Visibility1() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("--The logo is visible--");
	  Assert.assertEquals(netmeds_page1.Logo().isDisplayed(),true);
  }
  
  @Test(priority=2, enabled=false)
  public void Sign_In() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page1.Sign_In().click();
	  Thread.sleep(3000);
	  netmeds_page1.Phone().sendKeys("6284403095");
	  Thread.sleep(2000);
	  netmeds_page1.Use_OTP().click();
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  //Enter OTP manually
	  netmeds_page1.Verify().click();
	  Thread.sleep(20000);
	  WebElement Username = driver.findElement(By.xpath("//a[@id='logged_user']"));
	  Thread.sleep(2000);
	  System.out.println("---Logged in username:---"+Username.getText());
  }
  @Test(priority=3)
  public void Search() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page1.Search().sendKeys("Disprin");
	  netmeds_page1.Search().sendKeys(Keys.ENTER);
	  Thread.sleep(3000);	  
	  WebElement search = driver.findElement(By.xpath("//span[@id='search_kwrd']"));
	  System.out.println("--Showing results for--"+search.getText());
	  Assert.assertEquals(search.getText(), "Disprin");
	  driver.navigate().back();
  }
  @Test(priority=4)
  public void Medicine() throws InterruptedException {
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  WebElement Medicine = driver.findElement(By.xpath("//a[text()=' Medicine']"));
	  act.moveToElement(Medicine);
	  act.perform();
	  WebElement All_Medicine = driver.findElement(By.xpath("//a[text()='All Medicines']"));
	  act.moveToElement(All_Medicine);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  WebElement Med = driver.findElement(By.xpath("//div[@class='innercontent']"));
	  System.out.println(Med.getText());
	  Assert.assertEquals(Med.getText(), "Find Your Prescription Medicines\n"
	  		+ "Shop by Drug Category");
	  Thread.sleep(2000);
  }
  @Test(priority=5,enabled=false)
  public void Buy_Again() throws InterruptedException {
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  WebElement Medicine = driver.findElement(By.xpath("//a[text()=' Medicine']"));
	  act.moveToElement(Medicine);
	  act.perform();
	  WebElement Buy_Again = driver.findElement(By.xpath("//a[text()='Buy Again']"));
	  act.moveToElement(Buy_Again);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  driver.navigate().back();
  }
  @Test(priority=6)
  public void Wellness_Ayush() throws InterruptedException {
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Ayush = driver.findElement(By.xpath("(//a[text()='Ayush'])[1]"));
	  act.moveToElement(Ayush);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("------\n"+netmeds_page1.Ayush().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/ayush");
  }
  @Test(priority=7)
  public void Wellness_CovidEssentials() {
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Covid_Essentials = driver.findElement(By.xpath("//a[text()='Covid Essentials']"));
	  act.moveToElement(Covid_Essentials);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Covid_Essentials().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/covid-essentials");
  }
  @Test(priority=8)
  public void Wellness_Devices() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Devices = driver.findElement(By.xpath("(//a[text()='Devices'])[1]"));
	  act.moveToElement(Devices);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Devices().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/devices");
  }
  @Test(priority=9)
  public void Wellness_Diabetes_Support() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Diabetes_Support = driver.findElement(By.xpath("(//a[text()='Diabetes Support'])[1]"));
	  act.moveToElement(Diabetes_Support);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Diabetes_Support().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/diabetes-support");
  }
  @Test(priority=10)
  public void Wellness_Eyewear() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Eyewear = driver.findElement(By.xpath("(//a[text()='Eyewear'])[1]"));
	  act.moveToElement(Eyewear);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Eyewear().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/eyewear");
  }
  @Test(priority=11)
  public void Wellness_Fitness() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Fitness = driver.findElement(By.xpath("(//a[text()='Fitness'])[1]"));
	  act.moveToElement(Fitness);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("------\n"+netmeds_page1.Fitness().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/fitness");
  }
  @Test(priority=12)
  public void Wellness_Health_Conditions() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Health_Conditions = driver.findElement(By.xpath(" (//a[text()='Health Conditions'])[1]"));
	  act.moveToElement(Health_Conditions);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("------\n"+netmeds_page1.Health_Conditions().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions");
  } 
 
  	//Closing the browser
	@AfterClass
	public void terminate() {
	  	close();
	} 
}
