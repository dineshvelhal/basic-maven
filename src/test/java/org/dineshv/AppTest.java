package org.dineshv;


import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() {
        assertEquals(0, 0);
        System.out.println("LITE_REPORTS|App1|test1|pass");
    }

    @Test
    public void test2() {
        assertEquals(0, 0);
        System.out.println("LITE_REPORTS|App1|test2|pass");
    }

    @Test
    public void test3() {

        System.out.println("LITE_REPORTS|App1|test3|fail");

        assertEquals(0, 1);
    }
}
