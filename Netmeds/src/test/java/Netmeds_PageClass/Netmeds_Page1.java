package Netmeds_PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Page1 extends Netmeds_Testbase{
	//Constructor
	public Netmeds_Page1() {
		PageFactory.initElements(driver, this);
	}
	//Locating Elements
	//LOGO
	@FindBy(xpath="//div[@class='logo']")
	WebElement logo;
	//SIGN-UP/IN
	@FindBy(xpath="//a[text()=' Sign in / Sign up ']")
	WebElement Sign_in;
	//PHONE
	@FindBy(xpath="//input[@id='loginfirst_mobileno']")
	WebElement Phone;
	//USE OTP BUTTON
	@FindBy(xpath="//button[text()='USE OTP']")
	WebElement Use_OTP;
	//EMAIL
	@FindBy(xpath="//input[@id='reg_email']")
	WebElement Email;
	//FIRST NAME
	@FindBy(xpath="//input[@id='reg_firstname']")
	WebElement First_name;
	//LAST NAME
	@FindBy(xpath="//input[@id='reg_firstname']")
	WebElement Last_name;
	//VERIFY BUTTON
	@FindBy(xpath="//button[text()='verify']")
	WebElement Verify;
	//SEARCH 
	@FindBy(xpath="//input[@id='search']")
	WebElement Search;
	//AYUSH
	@FindBy(xpath="(//a[text()='Ayush'])[3]")
	WebElement Ayush;
	//COVID ESSENTIALS
	@FindBy(xpath="(//a[text()='Covid Essentials'])[2]")
	WebElement Covid_Essentials;
	//DEVICES
	@FindBy(xpath="(//a[text()='Devices'])[3]")
	WebElement Devices;
	//DIABETES SUPPORT
	@FindBy(xpath="(//a[text()='Diabetes Support'])[2]")
	WebElement Diabetes_Support;
	//EYEWEAR
	@FindBy(xpath="(//a[text()='Eyewear'])[3]")
	WebElement Eyewear;
	//FITNESS
	@FindBy(xpath="(//a[text()='Fitness'])[3]")
	WebElement Fitness;
	//HEALTH CONDITIONS
	@FindBy(xpath="(//a[text()='Health Conditions'])[2]")
	WebElement Health_Conditions;
	
	//Methods
	public WebElement Logo() {
		return logo;
	}
	public WebElement Sign_In() {
		return Sign_in;
	}
	public WebElement Phone() {
		return Phone;
	}
	public WebElement Use_OTP() {
		return Use_OTP;
	}
	public WebElement Email() {
		return Email;
	}
	public WebElement First_name() {
		return First_name;
	}
	public WebElement Last_name() {
		return Last_name;
	}
	public WebElement Verify() {
		return Verify;
	}
	public WebElement Search() {
		return Search;
	}
	public WebElement Ayush() {
		return Ayush;
	}
	public WebElement Covid_Essentials() {
		return Covid_Essentials;
	}
	public WebElement Devices() {
		return Devices;
	}
	public WebElement Diabetes_Support() {
		return Diabetes_Support;
	}
	public WebElement Eyewear() {
		return Eyewear;
	}
	public WebElement Fitness() {
		return Fitness;
	}
	public WebElement Health_Conditions() {
		return Health_Conditions;
	}
}