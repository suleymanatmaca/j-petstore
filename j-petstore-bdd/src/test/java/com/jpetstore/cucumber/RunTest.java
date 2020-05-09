package com.jpetstore.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features")
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@one")
public class RunTest {

}
