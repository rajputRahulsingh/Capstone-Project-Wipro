package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UploadPage;

public class UploadTest extends BaseTest {

    // Single File Upload
    @Test(priority = 1)
    public void verifySingleFileUpload() {

        UploadPage page =
        new UploadPage(driver);



        String filePath =

        System.getProperty("user.dir")

        + "\\src\\test\\resources\\file1.pdf";



        page.uploadSingleFile(filePath);

        page.clickSingleUploadButton();



        String successMsg =

        page.getSingleUploadMessage();



        Assert.assertTrue(

                successMsg.contains("file1.pdf")
        );



        System.out.println(
        successMsg);
    }



    // Multiple File Upload
    @Test(priority = 2)
    public void verifyMultipleFileUpload() {

        UploadPage page =
        new UploadPage(driver);



        String file1 =

        System.getProperty("user.dir")

        + "\\src\\test\\resources\\file1.pdf";



        String file2 =

        System.getProperty("user.dir")

        + "\\src\\test\\resources\\file2.pdf";



        page.uploadMultipleFiles(
                file1,
                file2);

        page.clickMultipleUploadButton();



        String successMsg =

        page.getMultipleUploadMessage();



        Assert.assertTrue(

                successMsg.contains("file1.pdf")

                &&

                successMsg.contains("file2.pdf")
        );



        System.out.println(
        successMsg);
    }
}