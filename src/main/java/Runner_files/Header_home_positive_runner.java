package Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "C:\\Users\\SARITHA H\\Downloads\\Appium_Framework-main\\src\\main\\java\\Header_Home_Page\\Header.feature",
glue= {"Header_Home_Page"},
monochrome = true,publish = true)
public class Header_home_positive_runner extends AbstractTestNGCucumberTests {

}
