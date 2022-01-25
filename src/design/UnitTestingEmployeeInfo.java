package design;


import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.util.Scanner;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

    }

    @Test
    public void testCalculateEmployeeBonus() {
        int expectedResult = 12000;
        int actualResult = EmployeeInfo.calculateEmployeeBonus(120000, "best");
        Assert.assertEquals( expectedResult, actualResult);
        System.out.println("test passed");
    }

    @Test
    public void testCalculateEmployeePension() throws ParseException {
        int expectedResult = 12000;
        int actualResult = EmployeeInfo.calculateEmployeePension(5,1200000);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");
    }

}