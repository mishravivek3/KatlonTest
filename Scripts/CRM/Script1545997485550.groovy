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

WebUI.navigateToUrl('http://talktoastro.com/')

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/a_About us (1)'))

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/a_Terms  Conditions (1)'))

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/a_Privacy Policy (1)'))

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/p_Credit card security'))

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/strong_The information user pr'))

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/a_Contact us (1)'))

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/div_Contact UsFirst nameLast n'))

WebUI.click(findTestObject('Object Repository/Page_Talk to Astro - Online Astrolo/button_Send'))

WebUI.closeBrowser()

