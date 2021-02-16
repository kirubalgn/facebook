package org.runnerTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,plugin= {"html:target","json:src\\test\\resources\\Reports\\fb.json"})

public class TestRunnerClass {

}
