ExtentReports:
@BeforeSuite----startreport---Reporter
   @BeforeTest----setValues----each testcasedetails
      @BeforeClass----startTestcase()-Reporter
          @Dataprovider---fetchData----psm
            @BeforeMethod----precondns--psm
                @Test-----testcases--testcase

             @Aftermethod----postcondns---psm
        @Afterclass
    @AfterTest
@Aftersuite-----endReport----reporter

Framework:
---------
1.Description:
-------------
-hybrid framework--->TestNG and BDD
-Selenium WebDriver-->automation tool--->to interact with the webappln.
-PageObjectModel----->designPattern
-Apache Poi--->to read the data values from Excel Sheet.
-Extent Report--->to generate a basic HTML automation summary report.

2.Components:
-------------
-com.framework.selenium.api.base
   -Driver instance
   -SeleniumBase
       -wrapper class for my framework
       -library for my framework where i have my reusable code for  easy maintenance
       we have applied try and  catch block for each method for proper exception handling

-com.framework.selenium.api.designPattern
   -Browser(all the unimplemented methods related to the browser activities)
   -Element(all the unimplemented methods related to the Element activities)

-com.framework.selenium.api.designPattern
   -projectSpecific methods 
      we have common methods specific to my projectSpecific like precondns and postcondns fetchData
   -retry analzer
    to run the failed testcases automatedly.

-com.framework.selenium.api.utils
   -Data library
     -to read the data from excel sheet using apache Poi
    -reporter
     -to genearte html summary report

-com.framework.selenium.api.pages
   -we have classes for each pages

-com.framework.selenium.api.testcases
    we have classes for each pages

3)Hierarchy
-----------
AbstractTestNgCucumberTests
  Driverinstance
    reporter
       seleniumbase
          projectspecificmethod
             pages
               testcases




