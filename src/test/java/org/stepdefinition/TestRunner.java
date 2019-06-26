package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RamyaVenkat\\eclipse-workspace\\Cucu\\src\\test\\resources\\feature",glue="org.stepdefinition",
               plugin="html:target")


public class TestRunner {

}
