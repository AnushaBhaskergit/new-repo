import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Zee5TestSuite')

suiteProperties.put('name', 'Zee5TestSuite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\anusha.g.bhasker\\Katalon Studio\\zee5tests\\Reports\\Zee5TestSuite\\20190125_104322\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Zee5TestSuite', suiteProperties, [new TestCaseBinding('Test Cases/Test Case Z5-333-Home Page', 'Test Cases/Test Case Z5-333-Home Page',  null), new TestCaseBinding('Test Cases/Test Case Z5-334-Originals', 'Test Cases/Test Case Z5-334-Originals',  null), new TestCaseBinding('Test Cases/Test Case Z5-335-Shows', 'Test Cases/Test Case Z5-335-Shows',  null), new TestCaseBinding('Test Cases/Test Case Z5-336-Live Tv', 'Test Cases/Test Case Z5-336-Live Tv',  null)])
