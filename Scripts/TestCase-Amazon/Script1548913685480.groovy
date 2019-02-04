import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable



/*String kobitonServerUrl = "https://manoj.finance14:617d4cd9-8eb6-4eac-85d5-1f8ac7d0f499@api.kobiton.com/wd/hub";

DesiredCapabilities capabilities = new DesiredCapabilities();
// The generated session will be visible to you only.
capabilities.setCapability("sessionName", "Automation test session");
capabilities.setCapability("sessionDescription", "");
capabilities.setCapability("deviceOrientation", "portrait");
capabilities.setCapability("captureScreenshots", true);
capabilities.setCapability("browserName", "chrome");
capabilities.setCapability("deviceGroup", "KOBITON");
// For deviceName, platformVersion Kobiton supports wildcard
// character *, with 3 formats: *text, text* and *text*
// If there is no *, Kobiton will match the exact text provided
capabilities.setCapability("deviceName", "Moto G (3rd Gen)");
capabilities.setCapability("platformVersion", "5.1.1");
capabilities.setCapability("platformName", "Android");
*/

WebUI.openBrowser('')

WebUI.navigateToUrl('www.amazon.com')

WebUI.waitForElementPresent(findTestObject('Amazon/AmazonLogo'), 10)

boolean t = WebUI.waitForElementPresent(findTestObject('Amazon/Departments'),10)
if(t==true)
{
	WebUI.comment('Departments opened')
}
else
{
	WebUI.comment('Departments did not open')
}
boolean g = WebUI.waitForElementPresent(findTestObject('Object Repository/Amazon/Music'),10)
if(t==true)
{
	WebUI.comment('Music opened')
}
else
{
	WebUI.comment('Music did not open')
}
WebUI.closeBrowser()

