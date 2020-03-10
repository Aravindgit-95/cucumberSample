package com.stepdefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.pojo.PojoClass;
import org.utility.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataStepDefinition extends BaseClass{
	
	@Given("^user should launch the browser$")
	public void user_should_launch_the_browser() throws Throwable {
		launch();
		driver.get("https://www.ikoala.com.au/");
	}

	@Given("^user should log in the app$")
	public void user_should_log_in_the_app(DataTable d) throws Throwable {
		Map<String, String> mp = d.asMap(String.class,String.class);
		PojoClass p=new PojoClass();
		click(p.getLogin());
		enter(p.getName(),mp.get("username"));
		enter(p.getPass(),mp.get("password"));
		click(p.getButton());
	}

	@When("^user should enter the values in src box$")
	public void user_should_enter_the_values_in_src_box(DataTable d1) throws Throwable {
		List<List<String>> li = d1.asLists(String.class);
		PojoClass p= new PojoClass();
		enter(p.getsearch(),li.get(0).get(2));
		
	}

	@Then("^user clicks the go button$")
	public void user_clicks_the_go_button() throws Throwable {
		PojoClass p= new PojoClass();
		click(p.getgo());
		
		int size = p.getImg().size();
		System.out.println(size);
		
		for (int i = 0; i < p.getImg().size(); i++) {
			
			click(p.getImg().get(i));
			
			driver.navigate().back();
			
			
			
		}
		
		
		
	}

	@When("^user enter the values randomly \"([^\"]*)\"$")
	public void user_enter_the_values_randomly(String s) throws Throwable {
		PojoClass p= new PojoClass();
		enter(p.getsearch(), s);
	}

	@Then("^user will click the go button$")
	public void user_will_click_the_go_button() throws Throwable {
		PojoClass p= new PojoClass();
		click(p.getgo());
	}






	
	
}