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
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.apache.poi.hssf.record.TextObjectRecord as TextObjectRecord
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.linkedin.com/login')

WebUI.setText(findTestObject('linkedin/Page_LinkedIn Login, Sign in  LinkedIn/input_Sign in_session_key'), 
    '')

WebUI.setEncryptedText(findTestObject('linkedin/Page_LinkedIn Login, Sign in  LinkedIn/input_Sign in_session_password'), 
    'ABswJ1Yx0xk=')

WebUI.click(findTestObject('linkedin/Page_LinkedIn Login, Sign in  LinkedIn/button_Sign in'))

WebUI.click(findTestObject('linkedin/CloseMessages/Page_(2) Feed  LinkedIn/div_Status is online                                                                      Messaging                                            You are on the messaging overlay. Press enter to minimize it'))

WebUI.setText(findTestObject('linkedin/Page_(1) Jobs  LinkedIn/Page_(3) software tester  Search  LinkedIn/Page_(3) Feed  LinkedIn/input_Close jump menu_search-global-typeahead__input             search-global-typeahead__input--ellipsis'), 
    'manual testing')

WebUI.sendKeys(findTestObject('linkedin/Page_(1) Jobs  LinkedIn/Page_(3) software tester  Search  LinkedIn/Page_(3) Feed  LinkedIn/input_Close jump menu_search-global-typeahead__input             search-global-typeahead__input--ellipsis'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('linkedin/Page_(1) Jobs  LinkedIn/Page_(3) software tester  Search  LinkedIn/button_Jobs'))

WebUI.click(findTestObject('linkedin/Page_(1) Jobs  LinkedIn/location/Page_(3) software tester Jobs  LinkedIn/input_City, state, or zip code_jobs-search-box-location-id-ember606'))

WebUI.click(findTestObject('linkedin/Page_(1) Jobs  LinkedIn/location/Page_(3) software tester Jobs  LinkedIn/svg_City, state, or zip code_artdeco-button__icon'))

WebUI.setText(findTestObject('linkedin/Page_(1) Jobs  LinkedIn/location/Page_(3) software tester Jobs  LinkedIn/input_City, state, or zip code_jobs-search-box-location-id-ember606'), 
    'Germany')

WebUI.sendKeys(findTestObject('linkedin/Page_(1) Jobs  LinkedIn/location/Page_(3) software tester Jobs  LinkedIn/input_City, state, or zip code_jobs-search-box-location-id-ember606'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('linkedin/Page_(1) software tester Jobs  LinkedIn/button_Easy Apply'))

WebUI.delay(2)

WebUI.newTab('')

WebUI.navigateToUrl('https://copilot.microsoft.com/')

WebUI.waitForElementClickable(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/button_Get started'), 3)

WebUI.click(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/button_Get started'))

WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_bebo'), 'bebo')

WebUI.click(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/button_bebo_relative flex items-center just_a83f91'))

WebUI.click(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/button_Next'))

'copy all ur CV here'
WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), Keys.chord(
        Keys.CONTROL, 'v'))

WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), Keys.chord(
        Keys.ENTER))

WebUI.switchToWindowIndex(0)

//'//div[contains(@class,'jobs-easy-apply-modal')]//select//parent::div//child::label'
// for yes and no Q 
////div[contains(@class,'jobs-easy-apply-modal')]//input//parent::div//preceding::legend
////div[contains(@class,'jobs-easy-apply-modal')]//h3      page title
WebDriver driver = DriverFactory.getWebDriver()

//------------------------------
for (int c = 1; c < 10; c++) {
    String containerXpath = (('(//li[contains(@class,\'ember-view\')])' + '[') + (c + 1)) + ']'

    TestObject container = new TestObject()

    container.addProperty('xpath', ConditionType.EQUALS, containerXpath)

    WebUI.click(container)

    WebUI.waitForElementClickable(findTestObject('linkedin/firstApply/Page_software test engineer Jobs  LinkedIn/button_Easy Apply'), 
        2)

    WebUI.verifyElementClickable(findTestObject('linkedin/firstApply/Page_software test engineer Jobs  LinkedIn/button_Easy Apply'))

    WebUI.click(findTestObject('linkedin/firstApply/Page_software test engineer Jobs  LinkedIn/button_Easy Apply'))

    WebUI.click(findTestObject('linkedin/final loop/Page_(14) manual testing Jobs  LinkedIn/button_Continue applying'), 
        FailureHandling.OPTIONAL)

    'keep clicking on next button untill u reach submit application'
    while (1 == 1) {
        //define page title
        TestObject pageTitle = new TestObject()

        String xpathExpression1 = '//div[contains(@class,\'jobs-easy-apply-modal\')]//h3'

        pageTitle.addProperty('xpath', ConditionType.EQUALS, xpathExpression1)

        WebUI.waitForElementPresent(pageTitle, 2)

        String pageTitleString = WebUI.getText(pageTitle)

        if (((pageTitleString == 'Resume') || (pageTitleString == 'Work experience')) || (pageTitleString == 'Education')) {
            WebUI.click(findTestObject('linkedin/firstApply/Page_software test engineer Jobs  LinkedIn/button_Next' //get label of all DDL in page
                    ))

            // all the comming code is for DDL
            //define the lable of all DDL in the page
            String xpathExpression = '//div[contains(@class,\'jobs-easy-apply-modal\')]//select//parent::div//child::label'

            List<WebElement> elements = driver.findElements(By.xpath(xpathExpression))

            println(elements.size())

            //on each DDL get label and options and send to copilot and get answer and select answer
            for (int i = 0; i < elements.size(); i++) {
                WebElement element = elements.get(i)

                //the label are duplicated so we split it 
                String elementText = (element.getText().split('\\n')[0]).trim()

                println((('Question ' + (i + 1)) + ': ') + elementText)

                //print the options of DDL
                //get the option of DDL and add it to list
                String xpathDDLoptions = ('(//div[contains(@class,\'artdeco-modal artdeco-modal--layer-default jobs-easy-apply-modal\')]//select)[ ' + 
                (i + 1)) + ']//option'

                List<String> optionList = new ArrayList()

                List<WebElement> op = driver.findElements(By.xpath(xpathDDLoptions))

                for (int m = 0; m < op.size(); m++) {
                    WebElement option = op.get(m)

                    optionList.add(option.getText())
                }
                
                println(optionList)

                //go back to ai and send request
                WebUI.switchToWindowIndex(1)

                String requestTOCopilot = (elementText + optionList) + ' make your answer contains only the index'

                WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), 
                    requestTOCopilot)

                WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), 
                    Keys.chord(Keys.ENTER))

                WebUI.delay(2)

                //get the last response of ai
                String jsScript = '\n\t\t\tconst responseElements = document.querySelectorAll(\'.space-y-3.break-words p span\');\n\t\t\t\n\t\t\tif (responseElements.length > 0) {\n\t\t\t    const lastResponse = responseElements[responseElements.length - 1]; \n\t\t\t    var result = lastResponse.textContent;\n\t\t\t    var fullString = "";\n\t\t\t    for (var i = 0; i < result.length; i++) {\n\t\t\t        fullString += result[i];\n\t\t\t    }\n\t\t\t    return fullString; \n\t\t\t}  else {\n\t\t\t        return \'No response found.\';\n\t\t\t    }\n\t\t\t'

                Object result1 = WebUI.executeJavaScript(jsScript, null)

                println('Debug - Raw result: ' + result1)

                //convert result into integer
                int number = Integer.parseInt(result1)

                println('the index of the answer is ' + number)

                //go back to linkedin
                WebUI.switchToWindowIndex(0)

                //define DDL to send data
                String xpathDDL = '(//div[contains(@class,\'jobs-easy-apply-modal\')]//select)'

                String uniqueXPath = ((xpathDDL + '[') + (i + 1)) + ']'

                TestObject DDLtestObject = new TestObject('dynamicObject' + (i + 1))

                DDLtestObject.addProperty('xpath', ConditionType.EQUALS, uniqueXPath)

                //click on DDL to open it
                WebUI.click(DDLtestObject)

                println('clicked on DDL')

                WebUI.selectOptionByIndex(DDLtestObject, number)

                //empty the option list
                optionList.clear()

                println('this is the value of options list :' + optionList //---------------------------------------------------------------------------------
                    //the comming part is for input field
                    //define how many input element in page
                    ) //get input type if text add value ,else input type is radio we click
            } //now we have each input as testobject
            //we will get attribute value to check
            //if type is text we use sendkey to send valus
            //define a new Testobject to get the label of this text
            //now send data to ai and get response
            //get the last response of ai
            //check for location question 
            //now let's go for type != text (radio button, check box)
            //get the text of if radio button
            //get the questions of input value
            //----------------------------------------------------------------------
            //-----------------------error-------------------------------
            //---------------------------------------------------------------------------------
            //the question are repeated towice we will split
            //now send data to ai and get response
            //get the last response of ai
            //remove the dot in the ai answer
            //now we will click on the radio button
            //-----------------------error--------checkk now----------------
        } else {
            String inputsExpression = '(//div[contains(@class,\'jobs-easy-apply-modal\')]//input)'

            List<WebElement> inputelements = driver.findElements(By.xpath(inputsExpression))

            println(inputelements.size())

            for (int i = 0; i < inputelements.size(); i++) {
                WebUI.delay(2)

                String uniqueinputxpath = ((inputsExpression + '[') + (i + 1)) + ']'

                TestObject inputTestObject = new TestObject('dynamicObject' + (i + 1))

                inputTestObject.addProperty('xpath', ConditionType.EQUALS, uniqueinputxpath)

                WebUI.delay(2)

                String type = WebUI.getAttribute(inputTestObject, 'type')

                if (type == 'text') {
                    String inputTextlabelXpath = uniqueinputxpath + '//parent::div//child::label'

                    TestObject inputTextLable = new TestObject('dynamicObjectinput' + (i + 1))

                    inputTextLable.addProperty('xpath', ConditionType.EQUALS, inputTextlabelXpath)

                    String inputQuestion = WebUI.getText(inputTextLable)

                    println(inputQuestion)

                    WebUI.switchToWindowIndex(1)

                    WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), 
                        inputQuestion)

                    WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), 
                        Keys.chord(Keys.ENTER))

                    WebUI.delay(2)

                    String jsScript = '\n\t\t\t\t\tconst responseElements = document.querySelectorAll(\'.space-y-3.break-words p span\');\n\t\t\t\t\t\n\t\t\t\t\tif (responseElements.length > 0) {\n\t\t\t\t\t    const lastResponse = responseElements[responseElements.length - 1]; \n\t\t\t\t\t    var result = lastResponse.textContent;\n\t\t\t\t\t    var fullString = "";\n\t\t\t\t\t    for (var i = 0; i < result.length; i++) {\n\t\t\t\t\t        fullString += result[i];\n\t\t\t\t\t    }\n\t\t\t\t\t    return fullString; \n\t\t\t\t\t}  else {\n\t\t\t\t\t        return \'No response found.\';\n\t\t\t\t\t    }\n\t\t\t'

                    Object result1 = WebUI.executeJavaScript(jsScript, null)

                    println('Debug - Raw result: ' + result1)

                    WebUI.switchToWindowIndex(0)

                    WebUI.setText(inputTestObject, result1)
                } else if (type == 'radio') {
                    String inputvlaue = WebUI.getAttribute(inputTestObject, 'value')

                    println(inputvlaue + '   this in is radio button value')

                    String radioQuestionXpathpure = ('(' + uniqueinputxpath) + '//parent::div//preceding::legend)'

                    List<WebElement> elements9 = driver.findElements(By.xpath(radioQuestionXpathpure))

                    List<TestObject> testObjectList9 = new ArrayList()

                    println(elements9.size() + 'this is faqin size')

                    for (int p = 0; p < elements9.size(); p++) {
                        WebElement element9 = elements9.get(p)

                        String uniqueXPath9 = ((radioQuestionXpathpure + '[') + (p + 1)) + ']'

                        println(uniqueXPath9)

                        TestObject testObject9 = new TestObject('dynamicObjectradio9' + (i + 1))

                        testObject9.addProperty('xpath', ConditionType.EQUALS, uniqueXPath9)

                        testObjectList9.add(testObject9)
                    }
                    
                    TestObject lastTestObject = testObjectList9.get(testObjectList9.size() - 1)

                    String lastRadioQuestion = WebUI.getText(lastTestObject)

                    String radioQuestionText = (lastRadioQuestion.split('\\n')[0]).trim()

                    println((('Question radio ' + (i + 1)) + ': ') + radioQuestionText)

                    WebUI.switchToWindowIndex(1)

                    WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), 
                        radioQuestionText)

                    WebUI.setText(findTestObject('linkedin/Page_Microsoft Copilot Your AI companion/textarea_hi'), 
                        Keys.chord(Keys.ENTER))

                    WebUI.delay(3)

                    String jsScriptradio = '\n\t\t\t\t\tconst responseElements = document.querySelectorAll(\'.space-y-3.break-words p span\');\n\t\t\t\t\t\n\t\t\t\t\tif (responseElements.length > 0) {\n\t\t\t\t\t    const lastResponse = responseElements[responseElements.length - 1]; \n\t\t\t\t\t    var result = lastResponse.textContent;\n\t\t\t\t\t    var fullString = "";\n\t\t\t\t\t    for (var i = 0; i < result.length; i++) {\n\t\t\t\t\t        fullString += result[i];\n\t\t\t\t\t    }\n\t\t\t\t\t    return fullString; \n\t\t\t\t\t}  else {\n\t\t\t\t\t        return \'No response found.\';\n\t\t\t\t\t    }\n\t\t\t'

                    String resultradio = WebUI.executeJavaScript(jsScriptradio, null).toString()

                    println('Debug - Raw radio: ' + resultradio)

                    if (resultradio.endsWith('.')) {
                        resultradio = resultradio.substring(0, resultradio.length() - 1)
                    }
                    
                    WebUI.switchToWindowIndex(0)

                    if (inputvlaue.toLowerCase() == resultradio.toLowerCase()) {
                        println(((('now we will click on radio button' + ' ') + inputvlaue) + ' ') + resultradio)

                        String radioyesorno = uniqueinputxpath + '//following-sibling::label'

                        TestObject inputyesorno = new TestObject('dynamicObjectziko' + (i + 1))

                        inputyesorno.addProperty('xpath', ConditionType.EQUALS, radioyesorno)

                        String kiko = 'the result before we click on the faqin object' + WebUI.getText(inputyesorno)

                        WebUI.click(inputyesorno)

                        println(kiko)

                        i++
                    }
                }
            }
            
            WebUI.click(findTestObject('linkedin/firstApply/Page_software test engineer Jobs  LinkedIn/button_Next'))

            String nextButtonText = WebUI.getText(findTestObject('linkedin/firstApply/Page_software test engineer Jobs  LinkedIn/button_Next'))

            if (nextButtonText == 'Submit application') {
                WebUI.click(findTestObject('linkedin/firstApply/Page_software test engineer Jobs  LinkedIn/button_Next'))

                break
            }
        }
    }
    
    WebUI.waitForElementClickable(findTestObject('linkedin/final loop/Page_(14) manual testing Jobs  LinkedIn/button_Done'), 
        3)

    WebUI.click(findTestObject('linkedin/final loop/Page_(14) manual testing Jobs  LinkedIn/button_Done'))
}

