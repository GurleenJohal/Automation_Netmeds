package Netmeds_Test;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Netmeds_PageClass.Netmeds_Page2;
import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Test_2 extends Netmeds_Testbase{
	//Object of Page Class
	Netmeds_Page2 netmeds_page2;
			
	//Invoking Browser
	@BeforeClass
	public void launchWebsite() throws IOException {
		initialize();
		netmeds_page2 =  new Netmeds_Page2();
	}
	
  @Test(priority=1)
  public void Lab_Tests() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page2.Lab_Tests().click();
	  System.out.println("---Lab Test page is invoked----\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/health-packages");
  }
  
  @Test(priority=2, dependsOnMethods="Lab_Tests")
  public void Health_packages() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Pathology = driver.findElement(By.xpath("//a[text()='Pathology']"));
	  Assert.assertEquals(Pathology.isDisplayed(), true);
	  netmeds_page2.Name().sendKeys("Gurleen Kaur");
	  netmeds_page2.Mobile().sendKeys("6284403095");
	  netmeds_page2.Pincode().sendKeys("141101");
	  netmeds_page2.Sel_Package().click();
	  netmeds_page2.Option1().click();
	  netmeds_page2.Sel_Test().click();
	  netmeds_page2.Option2().click();
	  netmeds_page2.Checkbox().click();
	  System.out.println("---Test is booked---\n");
	  Thread.sleep(2000);  
 }
  
  @Test(priority=3)
  public void Beauty_Fragrances() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Fragrances = driver.findElement(By.xpath("//a[text()='Fragrances']"));
	  act.moveToElement(Fragrances);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Fragrances page is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/fragrances");
  }
  
  @Test(priority=4)
  public void Beauty_Hair() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Hair = driver.findElement(By.xpath("(//a[text()='Hair'])[1]"));
	  act.moveToElement(Hair);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Hair page of beauty module is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/hair");
  }
  
  @Test(priority=5)
  public void Beauty_Makeup() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Makeup = driver.findElement(By.xpath("(//a[text()='Make-Up'])[1]"));
	  act.moveToElement(Makeup);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Makeup page of beauty module is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/make-up");
  }
  
  @Test(priority=6)
  public void Beauty_MomBaby() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement MomBaby = driver.findElement(By.xpath("(//a[text()='Mom & Baby'])[2]"));
	  act.moveToElement(MomBaby);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Mom & Baby page of beauty module is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/mom-baby");
  }
  
  @Test(priority=7)
  public void Beauty_PersonalCare() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement PersonalCare = driver.findElement(By.xpath("(//a[text()='Personal Care'])[2]"));
	  act.moveToElement(PersonalCare);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Personal Care page of beauty module is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/personal-care");
  }
  
  @Test(priority=8)
  public void Beauty_SkinCare() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement SkinCare = driver.findElement(By.xpath("(//a[text()='Skin Care'])[1]"));
	  act.moveToElement(SkinCare);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Skin Care page of beauty module is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/skin-care");
  }
  
  @Test(priority=9)
  public void Beauty_Tools() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Tools = driver.findElement(By.xpath("(//a[text()='Tools & Appliances'])[1]"));
	  act.moveToElement(Tools);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Tools page of beauty module is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/tools-appliances");
  } 
  
  @Test(priority=10)
  public void Health_Corner_HealthLibrary() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement Health_Corner = driver.findElement(By.xpath("(//a[text()=' Health Corner'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Health_Corner);
	  act.perform();
	  WebElement Health_Library = driver.findElement(By.xpath("//a[text()='Health Library']"));
	  act.moveToElement(Health_Library);
	  act.click().build().perform();
	  System.out.println("---Health library page is invoked---\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/health-library");
  }
  
  @Test(priority=11, dependsOnMethods="Health_Corner_HealthLibrary")
  public void Health_Library() { 
	  System.out.println("------\n"+netmeds_page2.HL_Content().getText());
	  Assert.assertEquals(netmeds_page2.HL_Content().isDisplayed(), true);
  }
  
  @Test(priority=12)
  public void Patients_alike() throws InterruptedException {
	  WebElement Health_Corner = driver.findElement(By.xpath("(//a[text()=' Health Corner'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Health_Corner);
	  act.perform();
	  WebElement PatientsAlike = driver.findElement(By.xpath("//a[text()='PatientsAlike']"));
	  act.moveToElement(PatientsAlike);
	  act.click().build().perform();
	  System.out.println("\n---Patients Alike page is invoked---\n");
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/health-library");
	  //driver.switchTo().parentFrame().getWindowHandle();
	  String winHandleBefore = driver.getWindowHandle();
	  for(String winHandle : driver.getWindowHandles()){
	      driver.switchTo().window(winHandle);
	  }
	  String winHandleAfter = driver.getWindowHandle();
	  driver.close();
	  driver.switchTo().window(winHandleBefore);
	  
  }
  
  @Test(priority=13, dependsOnMethods="Patients_alike")
  public void CoronaAwarenes() {
	  WebElement Health_Corner = driver.findElement(By.xpath("(//a[text()=' Health Corner'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Health_Corner);
	  act.perform();
	  WebElement CoronaAwarenes = driver.findElement(By.xpath("//a[text()='Corona Awareness']"));
	  act.moveToElement(CoronaAwarenes);
	  act.click().build().perform();
	  Assert.assertEquals(netmeds_page2.CovidInfo().isDisplayed(),true);
	  System.out.println("---Corona Awareness page is invoked---\n");
  }
  
  @Test(priority=14)
  public void Offers() {
	  netmeds_page2.Offers().click();
	  System.out.println("---Offer_Title---\n"+netmeds_page2.Offer_Title().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/offers");
  }
  
  @Test(priority=15, dependsOnMethods="Offers")
  public void Select_Offer() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page2.Med_Checkbox().click();
	  System.out.println("\n--------\n"+driver.findElement(By.xpath("(//div[@class='offer-top'])[1]")).getText());
	  netmeds_page2.View_Offer().click();
	  Assert.assertEquals(driver.getTitle(), "NMSNEW Flat 25% OFF on Medicines + 25% NMS SuperCash | Netmeds Offer");
  }
  
  @Test(priority=16, dependsOnMethods="Select_Offer")
  public void View_Offer() {
	  Actions act = new Actions(driver);               
	  act.sendKeys(Keys.PAGE_DOWN).build().perform();
	  netmeds_page2.Terms_Conditions().click();
	  System.out.println("\n-----Terms & Conditions-----\n"+driver.findElement(By.xpath("//div[@class='info']")).getText());
	  Assert.assertEquals(netmeds_page2.Terms_Conditions().isDisplayed(), true);
  }
  
  @Test(priority=17, dependsOnMethods="View_Offer")
  public void Count_Offers() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(2000);
	  List<WebElement> Offers = driver.findElements(By.xpath("//div[@class='offer-section medicine odd']"));
	  int Offers_Count = Offers.size();
	  System.out.println("----Total number of Offers are: "+Offers_Count+"-----\n");
  }
  
  @Test(priority=18)
  public void Add_to_Cart() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page2.Search().sendKeys("Combiflam");
	  netmeds_page2.Search().sendKeys(Keys.ENTER);
	  System.out.println("---Item Searched---\n");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.netmeds.com/catalogsearch/result/combiflam/all");
  }
  
  @Test(priority=19, dependsOnMethods="Add_to_Cart")
  public void Count_Items() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> Items = driver.findElements(By.xpath("//li[@class='ais-InfiniteHits-item']"));
	  int Total_items = Items.size();
	  System.out.println("----Total number of Items are: "+Total_items+"-----\n");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/catalogsearch/result/combiflam/all");
  }
  
  @Test(priority=20, dependsOnMethods="Count_Items")
  public void Item_Info() throws InterruptedException {
	  Thread.sleep(2000);
	  Assert.assertEquals(netmeds_page2.Item_info().isDisplayed(), true);
	  System.out.println("----Item Information----\n"+netmeds_page2.Item_info().getText());
  }
  
  @Test(priority=21, dependsOnMethods="Item_Info")
  public void Add_Item() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page2.Add_To_Cart_Button1().click();
	  Assert.assertEquals(netmeds_page2.Order_Count().isDisplayed(), true);
  }
  
  @Test(priority=22, dependsOnMethods="Add_Item")
  public void Order_Count() {
	  netmeds_page2.Add_To_Cart_Button2().click();
	  Assert.assertEquals(netmeds_page2.Order_Count().isDisplayed(), true);
	  System.out.println("----Total number of Items are:----\n"+netmeds_page2.Order_Count().getText());	  
  }
  
  @Test(priority=23, dependsOnMethods="Order_Count")
  public void Order_Summary() {
	  Assert.assertEquals(netmeds_page2.Order_Summary().isDisplayed(), true);
	  System.out.println("----Order Summary----\n"+netmeds_page2.Order_Summary().getText());
  }
  
  @Test(priority=24)
  public void Cart() throws InterruptedException {
	  Assert.assertEquals(netmeds_page2.Cart().isDisplayed(),true);
	  netmeds_page2.Cart().click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=25, dependsOnMethods="Cart")
  public void Cart_Product() {
	  Assert.assertEquals(netmeds_page2.Cart_Product().isDisplayed(), true);
	  System.out.println("Products in the cart:----\n"+netmeds_page2.Cart_Product().getText());
  }
  
  
  //Closing the browser
  @AfterClass
  public void terminate() {
	  close();
  }
}
