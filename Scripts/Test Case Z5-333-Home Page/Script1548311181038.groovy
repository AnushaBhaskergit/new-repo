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

//WebUI.maximizeWindow()
WebUI.delay(2)

boolean zee5 = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Zee5LogoCheck'), 5)

if (zee5 == true) {
    println('Homepage Loaded successfully')
} else {
    println('Homepage load failed')
}

WebUI.delay(5)

//((JavascriptExecutor)ChromeDriver()).executeScript(“document.getElementByxpath("//div//span[@class = "confirm-button qg-fake-prompt-confirm-button"]").click()”))
//((JavascriptExecutor) DriverFactory.getWebDriver()).executeScript(“document.getElementByxpath("//div//span[@class = "confirm-button qg-fake-prompt-confirm-button"]").click()”))
WebUI.delay(5)

WebUI.click(findTestObject('HomepageObjects - Copy/EnableNotifications'))

WebUI.delay(5)

boolean premium = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for premium'), 2)

if (premium == true) {
    println('Premium section is present on Homepage')
} else {
    println('Premium section is missing on Homepage')
}

boolean shows = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for Shows'), 2)

if (shows == true) {
    println('Shows section is present on Homepage')
} else {
    println('Shows section is missing on Homepage')
}

WebUI.click(findTestObject('HomepageObjects - Copy/ScrollToleft'), FailureHandling.STOP_ON_FAILURE)

boolean movies = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for Movies'), 2)

if (movies == true) {
    println('Movies section is present on Homepage')
} else {
    println('Movies section is missing on Homepage')
}

WebUI.click(findTestObject('HomepageObjects - Copy/ScrollToleft'))

boolean news = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for News'), 2)

if (news == true) {
    println('News section is present on Homepage')
} else {
    println('News section is missing on Homepage')
}

WebUI.click(findTestObject('HomepageObjects - Copy/ScrollToleft'), FailureHandling.STOP_ON_FAILURE)

boolean videos = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for videos'), 2)

if (videos == true) {
    println('Videos section is present on Homepage')
} else {
    println('Videos section is missing on Homepage')
}

WebUI.click(findTestObject('HomepageObjects - Copy/ScrollToleft'))

boolean livetv = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for LiveTv'), 5)

if (livetv == true) {
    println('LiveTv section is present on Homepage')
} else {
    println('LiveTv section is missing on Homepage')
}

boolean TvGuide = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for TvGuide'), 5)

if (TvGuide == true) {
    println('TvGuide section is present on Homepage')
} else {
    println('TvGuide section is missing on Homepage')
}

boolean Languageicon = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for Languageicon'), 5)

if (Languageicon == true) {
    println('Language icon section is present on Homepage')
} else {
    println('Language icon section is missing on Homepage')
}

boolean Searchicon = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Check for Searchicon'), 5)

if (Searchicon == true) {
    println('Search Icon section is present on Homepage')
} else {
    println('Search Icon section is missing on Homepage')
}
boolean carousalcheck = WebUI.verifyElementPresent(findTestObject('HomepageObjects - Copy/CheckforCarousal'), 5)

if (carousalcheck == true) {
	println('Carousal is present on Homepage')
} else {
	println('Carousal is missing on Homepage')
}
//WebUI.click(findTestObject('HomepageObjects - Copy/ContentsPlayon Homepage'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)
/*
WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> gi = driver.findElements(By.xpath('//div[@class="grid-container card--content ng-star-inserted"]'))[1].click()

//WebUI.click(findTestObject('HomepageObjects/ContentsPlay on Homepage'))
WebUI.delay(40)
//WebDriver driver = DriverFactory.getWebDriver()

//List<WebElement> gi = driver.findElements(By.xpath('//div[@class="grid-container card--content ng-star-inserted"]'))[1].click()

//WebUI.click(findTestObject('HomepageObjects/ContentsPlay on Homepage'))
//WebUI.delay(40)
not_run: WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/HomepageObjects - Copy/EnableNotifications'), 
    5)

not_run: WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

WebUI.delay(2)



/*boolean premiumcontentscheck = WebUI.verifyElementPresent(findTestObject('HomepageObjects - Copy/Premium contents on homepage'),
	5)
not_run: WebUI.scrollToElement(findTestObject('HomepageObjects - Copy/Premium contents on homepage'), 5)

not_run: WebUI.verifyElementPresent(findTestObject('HomepageObjects - Copy/Premium contents on homepage'), 5)

 if (premiumcontentscheck == true) {
    println('Premium contents are present on Homepage')
} 
 else {
    println('Premium contents are missing on Homepage')
}



//WebUI.focus(findTestObject('HomepageObjects/Playbackcontrols while playing'))
//List <WebElement> buttons =  WebUI.focus(findTestObject('HomepageObjects/ContentsPlay on Homepage'))
//buttons.Click()
//WebUI.click(findTestObject('HomepageObjects/ContentPlaying after selection'))
//if (contentplayconfirmation == true) {
//   println('Content playback successful')
//} else {
//    println('Content playback failed')
//}
WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('HomepageObjects - Copy/Zee5LogoCheck'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementPresent(findTestObject('HomepageObjects/Zee5 image check'), 5)

boolean Login = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Login on homapage'), 5)

not_run: WebUI.executeJavaScript('//span[@class=\'confirm-button qg-fake-prompt-confirm-button\']', [])

if (Login == true) {
	println('Login  section is present on Homepage')
} else {
	println('Login  section is missing on Homepage')
}

boolean Threedotmenu = WebUI.waitForElementPresent(findTestObject('HomepageObjects - Copy/Hamburger menu on Homepage'),
	5)

if (Threedotmenu == true) {
	println('Threedotmenu  section is present on Homepage')
} else {
	println('Threedotmenu  section is missing on Homepage')
}

WebUI.click(findTestObject('HomepageObjects - Copy/Close hamburgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('HomepageObjects - Copy/Hamburger menu on Homepage'))

String aboutUs = WebUI.verifyElementPresent(findTestObject('HomepageObjects - Copy/AboutUs on Homepage'), 5)

println(aboutUs)

if (aboutUs.contentEquals('About Us')) {
    println('About Us is present on Homepage footer')
} else {
    println('About Us is missing on Homepage footer')
}

String contactUs = WebUI.getText(findTestObject('HomepageObjects/Contact Us on Homepage'))

println(contactUs)

if (contactUs.contentEquals('Contact Us')) {
    println('Contact Us is present on Homepage footer')
} else {
    println('Contact Us is missing on Homepage footer')
}

String Help = WebUI.getText(findTestObject('HomepageObjects/Help on Homepage'))

println(Help)

if (Help.contentEquals('Help')) {
    println('Help is present on Homepage footer')
} else {
    println('Help is missing on Homepage footer')
}

String privacypolicy = WebUI.getText(findTestObject('HomepageObjects/PrivacyPolicy on Homepage'))

println(privacypolicy)

if (privacypolicy.contentEquals('Privacy Policy')) {
    println('PrivacyPolicy is present on Homepage footer')
} else {
    println('PrivacyPolicy is missing on Homepage footer')
}

String termsofuse = WebUI.getText(findTestObject('HomepageObjects/TermsOfuse on Homepage'))

println(termsofuse)

//Assert.assertEquals(termsofuse, Terms of Use, "Your debug message that you want to display in case of failure")
if (termsofuse.contentEquals('Terms of Use')) {
    println('TermsOfuse is present on Homepage footer')
} else {
    println('TermsOfuse is missing on Homepage footer')
}
*/
WebUI.closeBrowser()

