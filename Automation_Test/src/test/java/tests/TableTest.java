package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.TablePage;

public class TableTest extends BaseTest {

    @Test
    public void verifyStaticTable() {

        TablePage table =
        new TablePage(driver);

        int totalRows =
        table.getStaticTableRowCount();

        System.out.println(
        "Total Rows: "
        + totalRows);

        String bookName =
        table.getBookName(2);

        System.out.println(
        "Book Name: "
        + bookName);

        Assert.assertEquals(
        bookName,
        "Learn Selenium");
    }



    @Test
    public void verifyDynamicTable() {

        TablePage table =
        new TablePage(driver);

        System.out.println(
        table.getCPUUsage());

        System.out.println(
        table.getMemorySize());
    }



    @Test
    public void verifyPaginationTable() {

        TablePage table =
        new TablePage(driver);

        table.selectProductCheckbox(2);

        String product =
        table.getProductName(2);

        System.out.println(
        "Selected Product: "
        + product);

        table.clickPaginationNumber("2");
    }
}