package week6.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		//set up the report path
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/result.html");
		
		
		//create an object for extentreports
		ExtentReports extent=new ExtentReports();
		
		//attach the data with the file
		
		extent.attachReporter(report);
		
		
		//create a testcase and assign the details 
		ExtentTest test=extent.createTest("CreateLead","c.l some mandatory details");
		
		//assign a catoegory
		test.assignCategory("smoke");
		test.assignAuthor("saranya");
		
		//attach the testlevel status
		test.pass("username entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/homepage.png").build());
		test.pass("password entered sucessfully");
		test.pass("login is sucessful");
		
		
		
		//mandatory step
		extent.flush();//reports will be saved in the report folder
		System.out.println("completedS");
		
	}

}
