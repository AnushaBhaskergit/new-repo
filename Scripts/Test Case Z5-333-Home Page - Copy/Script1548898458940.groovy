 //Verify the Home Page loads fine and the content plays fine, proper buckets links display and ads play
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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import java.util.jar.JavaUtilJarAccessImpl as JavaUtilJarAccessImpl
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.interactions.Action as Action
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import static org.junit.Assert.assertTrue
import org.testng.Assert as Assert
import org.junit.Assert as Assert
import java.lang.Object as Object
import static org.junit.Assert.*
import org.junit.Test as Test

/*public void testApp() throws MalformedURLException, InterruptedException 
{
DesiredCapabilities capabilities= new DesiredCapabilities();

capabilities.setCapability("unicodeKeyboard", "true");
capabilities.setCapability("resetKeyboard", "true");
}*/
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.appurl)

WebUI.waitForPageLoad(2)

//WebUI.maximizeWindow()
WebUI.delay(2)

boolean zee51 = WebUI.waitForElementPresent(findTestObject('next/Zee5LogoCheck'), 5)

if (zee51 == true) {
    println('Homepage Loaded successfully')
} else {
    println('Homepage load failed')
}

WebUI.delay(5)

//((JavascriptExecutor)ChromeDriver()).executeScript(“document.getElementByxpath("//div//span[@class = "confirm-button qg-fake-prompt-confirm-button"]").click()”))
//((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript(“document.getElementByxpath("//div//span[@class = "confirm-button qg-fake-prompt-confirm-button"]").click()”))
//WebUI.delay(5)

WebUI.click(findTestObject('next/EnableNotifications'))

WebUI.click(findTestObject('next/Hamburger menu on Homepage'))

WebUI.click(findTestObject('next/Login on homapage'))

WebUI.waitForElementPresent(findTestObject('next/Login with mobile number element'), 10)
WebDriver driver = DriverFactory.getWebDriver()
//driver.findElements(By.xpath('//div[@class="grid-container card--content ng-star-inserted"]')

element = driver.findElement(By.xpath('//div[@class="mobileContainerForm"]'))

Actions actions = new Actions(driver)

actions.moveToElement(element)

actions.click()

actions.sendKeys('9704124134')
actions.perform()

element1 = driver.findElement(By.xpath('//div[@class="passwordContainer"]'))
Actions actions1 = new Actions(driver)

actions1.moveToElement(element1)

actions1.click()

actions1.sendKeys('9704124134')
actions1.perform()
//WebUI.sendKeys(findTestObject('next/Enter mobilenumber'), GlobalVariable.MobileNumber)
//WebUI.click(findTestObject('next/Enter password'))

//WebUI.sendKeys(findTestObject('next/Enter password'), GlobalVariable.Password)

WebUI.click(findTestObject('next/Login button'))

boolean zee52 = WebUI.waitForElementPresent(findTestObject('next/Zee5LogoCheck'), 5)

if (zee52 == true) {
    println('Homepage Loaded successfully')
} else {
    println('Homepage load failed')
}

WebUI.closeBrowser()

