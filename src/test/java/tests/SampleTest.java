package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {


    int a = 2+2;

    @Test
    void sum(){
        Assert.assertEquals(a,4);
        System.out.println("sum is 4");
    }

}
