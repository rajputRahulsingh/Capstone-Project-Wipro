package reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports getInstance() {

		if(extent == null) {

			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
					.format(new Date());

			String reportPath = System.getProperty("user.dir")
					+ "/reports/TestReport_"
					+ timeStamp
					+ ".html";

			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);

			reporter.config().setReportName("Automation Report");

			reporter.config().setDocumentTitle("SDET Framework");

			extent = new ExtentReports();

			extent.attachReporter(reporter);

			extent.setSystemInfo("Tester","Rahul");

			extent.setSystemInfo("Environment","QA");
		}

		return extent;
	}
}