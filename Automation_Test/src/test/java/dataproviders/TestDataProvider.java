package dataproviders;

import org.testng.annotations.DataProvider;

import utils.ExcelUtil;

public class TestDataProvider {

    @DataProvider(name = "formData")

    public Object[][] getFormData() {

        String path =

        "C:\\Users\\ashus\\Desktop\\wipro_Sdet\\testData.xlsx";

        return ExcelUtil.getExcelData( path,"Sheet1");
    }
}