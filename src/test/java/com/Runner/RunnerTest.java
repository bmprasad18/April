package com.Runner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature",glue="com\\stepdefinition")



public class RunnerTest {
	public static WebDriver driver;
	
	
	@Before
	public void Setup() {

		driver=BaseClass.browserlaunch("Chrome");
	}
	
	
	@After
	public void TearDown() {
		driver.close();

		
	}

}
