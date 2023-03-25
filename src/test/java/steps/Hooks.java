package steps;

import Utilities.Driver;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setup (){
        System.out.println("The beginning of the Scenario ");
    }
   @After
    public  void cleanUp(Scenario scenario){
        System.out.println("scenario.getStatus() ");
       Driver.quitBrowser();
       if (scenario.isFailed()){
           byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot, "image/png", scenario.getName());

       }
       Driver.quitBrowser();
    }



}
