package org.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PojoClass extends BaseClass {
	
	public PojoClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='https://www.ikoala.com.au/login']")
	
	private WebElement login;
	
	@FindBy(xpath="(//input[@name='email'])[3]")
	
	private  WebElement name;
	
	@FindBy(xpath="(//input[@name='password'])[3]")
	
	private WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']")
	
	private WebElement button;
	
	@FindBy(xpath="//input[@class='form-control ']")
	
	private WebElement search;
	
	@FindBy(xpath="//div[@class='input-group-addon btn  srchbtn']")
	
	private WebElement go;
	
	@FindBy(xpath="//*[@class='img-responsive products-listings']")
	
	private List<WebElement> img;
	
	public List<WebElement> getImg(){
		return img;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;
	}
	
	public WebElement getsearch() {
		return search;
		
	}
	
	public WebElement getgo() {
		return go;
	}
}
