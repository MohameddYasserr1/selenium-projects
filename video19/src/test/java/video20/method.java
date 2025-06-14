// hena el far2 ben el code el fat w da eny method bt5le before w after yt3mlo m3 kol case msh fl awl wl akher bas
package video20;

import org.testng.annotations.*;

public class method {
    @BeforeMethod
    void before() {System.out.println("begin");}
    @Test
    void test1() {System.out.println("case1");}
    @Test
    void test2() {System.out.println("case2");}
    @AfterMethod
    void done() {System.out.println("done");}

}
