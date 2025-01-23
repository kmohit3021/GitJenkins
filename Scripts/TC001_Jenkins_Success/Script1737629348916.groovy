import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/h3_We Care About Your Health'), 
    'We Care About Your Health')

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/a_btn-make-appointment'))

WebUI.setText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_Username_1'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_Password_1'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/button_btn-login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/select_Facility'), 'Seoul CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_programs'))

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/input_dd_mm_yyyy'))

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/td_28'))

WebUI.setText(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/textarea_Comment'), 'test')

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/button_btn-book-appointment'))

WebUI.click(findTestObject('Object Repository/OR Web/Page_CURA Healthcare Service/a_Go to Homepage'))

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Mohit', false)

WebUI.closeBrowser()

