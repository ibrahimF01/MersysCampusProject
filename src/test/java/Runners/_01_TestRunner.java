package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
   features = {"src/test/java/FeatureFiles/_01_Login.feature"}, //buraya feature files in path yolu verilecek
   glue ={"StepDefinitions"}     //step definitions un klasörü yazılacak



)
public class _01_TestRunner extends AbstractTestNGCucumberTests {



}
