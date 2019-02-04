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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import static org.junit.Assert.assertTrue
import org.testng.Assert as Assert
import org.junit.Assert as Assert
import java.lang.Object as Object
import static org.junit.Assert.*
import org.junit.Test as Test

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.appurl)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.delay(2)

boolean zee5 = WebUI.verifyElementPresent(findTestObject('HomepageObjects - Copy/Zee5LogoCheck'), 5)

if (zee5 == true) {
    println('Homepage Loaded successfully')
} else {
    println('Homepage load failed')
}

WebUI.delay(5)

//((JavascriptExecutor)ChromeDriver()).executeScript(“document.getElementByxpath("//div//span[@class = "confirm-button qg-fake-prompt-confirm-button"]").click()”))
//((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript(“document.getElementByxpath("//div//span[@class = "confirm-button qg-fake-prompt-confirm-button"]").click()”))
WebUI.delay(5)

WebUI.click(findTestObject('HomepageObjects - Copy/Hamburger menu on Homepage'))

WebUI.click(findTestObject('HomepageObjects - Copy/Login on homapage'))

WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Login with mobile number element'), 10)

WebUI.click(findTestObject('HomepageObjects - Copy/Enter mobilenumber'))

WebUI.sendKeys(findTestObject('HomepageObjects - Copy/Enter mobilenumber'), GlobalVariable.MobileNumber)

WebUI.click(findTestObject('HomepageObjects - Copy/Enter password'))

WebUI.sendKeys(findTestObject('HomepageObjects - Copy/Enter password'), GlobalVariable.Password)

WebUI.click(findTestObject('HomepageObjects - Copy/Login button'))

boolean zee5 = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Zee5LogoCheck'), 5)

if (zee5 == true) {
    println('Homepage Loaded successfully')
} else {
    println('Homepage load failed')
}
WebUI.closeBrowser()
/*
WebUI.click(findTestObject('LiveTvObjects/MoreoptionsonHomepage'))

WebUI.waitForElementPresent(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'), 3)

WebUI.click(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'))

WebDriver driver = DriverFactory.getWebDriver()

WebUI.waitForElementPresent(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'), 5)

List<WebElement> g = driver.findElements(By.xpath('//img[@class="thumbnail-image"]'))[1].click()

//WebUI.click(findTestObject('Object Repository/TVShowspageObjects/Sorting checks on episode titles'))[1]
WebUI.delay(45)

WebUI.mouseOver(findTestObject('TVShowspageObjects/Menubarwhilecontentplayback'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/TVShowspageObjects/Pausebuttonwhilecontentplay'), 5)
//WebUI.executeJavaScript('//div[@class=\'playerInfoSection\']', ['//div[@class=\'playerInfoSection\']'])
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/TVShowspageObjects/Pausebuttonwhilecontentplay'), 
    45)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.delay(2)

WebUI.click(findTestObject('LiveTvObjects/MoreoptionsonHomepage'))

WebUI.waitForElementPresent(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'), 3)

WebUI.click(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'))

WebUI.waitForElementPresent(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'), 5)

//div[@class='emptyDiv imageCategoryTv']/a[contains(@href,'tvshows')]/@href
//List<WebElement> h = driver.findElements(By.xpath('//div[@class="emptyDiv imageCategoryTv"]/a[contains(@href,"tvshows")]/@href'))[1].click()
//WebUI.click(findTestObject('Object Repository/TVShowspageObjects/Sorting checks on episode titles'))[1]
WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/OriginalspageObjects/Selectanepisode'), 5)

WebUI.click(findTestObject('Object Repository/OriginalspageObjects/Selectanepisode'))

WebUI.delay(45)

WebUI.mouseOver(findTestObject('TVShowspageObjects/Menubarwhilecontentplayback'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/TVShowspageObjects/Pausebuttonwhilecontentplay'), 5)
//WebUI.executeJavaScript('//div[@class=\'playerInfoSection\']', ['//div[@class=\'playerInfoSection\']'])
WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/TVShowspageObjects/Pausebuttonwhilecontentplay'), 
    45)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

WebUI.delay(2)

ArrayList<String> obtainedList = new ArrayList<String>()

By mySelector = By.xpath('//div[@class="titleoneepisode ng-star-inserted"]')

List<WebElement> elementList = driver.findElements(mySelector)

for (WebElement we : elementList) {
    WebUI.comment(we.getText())

    obtainedList.add(we.getText())
}

ArrayList<String> sortedList = new ArrayList<String>()

for (String s : obtainedList) {
    sortedList.add(s)
}

Collections.sort(sortedList)

//Collections.reverse(sortedList)
//WebUI.comment(sortedList)
//WebUI.comment(obtainedList)
Assert.assertTrue('titles are in ascending order', sortedList.equals(obtainedList))

WebUI.click(findTestObject('LiveTvObjects/MoreoptionsonHomepage'))

WebUI.waitForElementPresent(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'), 3)

WebUI.click(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'))

WebUI.waitForElementPresent(findTestObject('OriginalspageObjects/OriginlslinkonHomepage'), 5)

int a = driver.findElements(By.xpath('//img[@class=\'thumbnail-image\']')).size()

int b = driver.findElements(By.xpath('//div[@class=\'premium-button ng-star-inserted\']')).size()

if (a == b) {
    WebUI.comment('All originals contents are premium')
} else {
    WebUI.comment('All originals contents are not premium')
}

WebUI.comment('Count of Thumbnails in Originals page are :' + a)

if (a != 0) {
    WebUI.comment('Thumbnails are present in Originals page')
} else {
    WebUI.comment('Thumbnails are missing in Originals page')
}
*/


