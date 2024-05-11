package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    //glue = "src/test/java/steps"
    glue = "steps",
    //tags = "@Test"
    plugin = {"pretty",
      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
      "timeline:test-output-thread/" },
    monochrome = true,
    tags = "@Cart"
)

public class Runner{
 @AfterClass
 public static void cleanDriver(){
    BasePage.closeBrowser();
}
}

