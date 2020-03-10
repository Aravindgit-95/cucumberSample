package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\FeatureFile\\koalapojo.feature"},
glue= {"com.stepdefinition"},monochrome=true,tags= {"~@Sanity","~@Regression"})
public class TestRunner {

}