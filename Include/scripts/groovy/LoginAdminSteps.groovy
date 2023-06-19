import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginAdminSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given ("Admin Log in on the AltaTech website")
	def Admin_Log_in_on_the_AltaTech_website() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-tech.netlify.app/')
	}

	@And ("Admin enters an email address in the (.*)")
	def Admin_enters_an_email_address_in_the_Email(String Email) {
		WebUI.setText(findTestObject('Object Repository/LoginAdmin/Page_Vite  React/input_Log in_normal_login_username'), Email)
	}

	@And ("Admin enters a password in the (.*)")
	def Admin_enters_a_password_in_the_Password(String Password) {
		WebUI.setText(findTestObject('Object Repository/LoginAdmin/Page_Vite  React/input_Log in_normal_login_password'), Password)
	}
	@When("Admin presses the Login button")
	def Admin_presses_the_Login_button(String status) {
		//		WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_Log in'))
		WebUI.click(findTestObject('Object Repository/LoginAdmin/Page_Vite  React/button_Log in'))
	}

	@Then("Admin click button Confirm")
	def Admin_click_button_Confirm(String status) {
		//		WebUI.click(findTestObject('Object Repository/Page_Vite  React/button_Confirm'))
		WebUI.click(findTestObject('Object Repository/LoginAdmin/Page_Vite  React/button_Confirm'))
	}
	//	@Then("I see an error message (.*)")
	//	def verifyErrorMessage(String message) {
	//		String actual = WebUI.getText(findTestObject('Object Repository/Login/Page_Instagram/Page_Instagram/p_Sorry, your password was incorrect. Please double-check your password'))
	//		WebUI.verifyMatch(actual, message, true)
	//		WebUI.closeBrowser()
	//	}
}