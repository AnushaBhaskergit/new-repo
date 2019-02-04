package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object appurl
     
    /**
     * <p></p>
     */
    public static Object pausebuttonwhilecontentplayback
     
    /**
     * <p></p>
     */
    public static Object MobileNumber
     
    /**
     * <p></p>
     */
    public static Object Password
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['appurl' : 'https://www.zee5.com/', 'pausebuttonwhilecontentplayback' : findTestObject('TVShowspageObjects/Pausebuttonwhilecontentplay'), 'MobileNumber' : '9704124134', 'Password' : '9704124134'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        appurl = selectedVariables["appurl"]
        pausebuttonwhilecontentplayback = selectedVariables["pausebuttonwhilecontentplayback"]
        MobileNumber = selectedVariables["MobileNumber"]
        Password = selectedVariables["Password"]
        
    }
}
