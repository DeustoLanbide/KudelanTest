import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://desarrollo.lanbide.net:7001/lankuSolicitudesWar/login')

WebUI.setText(findTestObject('input_usuario (2)'), 'U01')

WebUI.setText(findTestObject('input_contrasena (2)'), 'U01')

WebUI.click(findTestObject('button_Entrar (2)'))

WebUI.click(findTestObject('a_Solicitudes'))

WebUI.click(findTestObject('a_Alta de Solicitud'))

WebUI.delay(0)

WebUI.setText(findTestObject('input_soliCargo'), 'Responsable de Oficina')

WebUI.click(findTestObject('div_Informtica'))

WebUI.click(findTestObject('label_Ordenadores'))

WebUI.setText(findTestObject('textarea_descSol'), 'loedenador nuevo')

WebUI.sendKeys(findTestObject('textarea_descSol'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('textarea_descSol'), 'Ordenador nuevo')

WebUI.click(findTestObject('label_Media'))

WebUI.click(findTestObject('input_ver3'))

WebUI.click(findTestObject('button_Enviar'))

WebUI.click(findTestObject('div_Se ha generado con xito la'))

WebUI.click(findTestObject('a_KUDELAN'))

WebUI.setText(findTestObject('input_seqnum'), '61')

WebUI.closeBrowser()

