Agenda:
        > 10:00 -  11.00 ->  Annotations
        > 11:00 - 11.15 -> Breakout+break
        > 11:15 - 11:50 -> StaticParameterization
        > 11:50 - 12:10 ->Breakout
        > 12:10 - 12:50 -> DynamicParametrization
        > 12:50 - 1:10  -> Breakout



Parameterization:
No hardcoding of data


Steps to implement Static Parameterization:

1.Identify the data that are common data across all testcases ex: url,username,password
2.Add parameter tag for each one of the data in the testng.xml file
3.Map the parameters in the java class using @Parameters Note: The name should exactly match the names in the xml @Parameters({"url","username","password"})
4.Use that parameters inside the mathod using arguments Note: Sequence matters but the name of the argument doesnot matter public void preCondition(String url,String uName,String pWord)
5.Finally, replace it with arguments driver.get(url);
Note: You should always run from the xml file when you use parameters

Dynamic Parameterization
Steps to implement Dynamic Parameterization:

1.Identify the datas that are specific to the particular testcase ex: CreateLead - compnayname, firstname, lastname, phonenumber EditLead - phonenumber,companyname
2.Create a method sendData() inside the CreateLead class
3.Annotate that method with @DataProvider
4.Inside sendData() create 2-Dimensional array with number of rows and columns
5.Add all the sets of data into the array and make sure the index starts from 0
6.Return the data back to the calling method
7.Receive this data in the test method
8.use dataprovider attibute
9.use that arguments inside the method.
Finally, replace the hardcoded values
@BS @BT @BC @DP @BM @T @AM @AC @AT 