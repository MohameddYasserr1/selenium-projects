package video20;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
    @BeforeTest
    void before() {System.out.println("begin");}
    @Test
    void test1() {System.out.println("case1");}
    @Test
    void test2() {System.out.println("case2");}
    @AfterTest
    void done() {System.out.println("done");}
}