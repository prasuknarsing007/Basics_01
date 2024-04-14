package src.basics_01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FDG {
@Test
public void assertEqualsass(){
	String actResult="Hello";
	String expResult="Hii";
	
	Assert.assertEquals(actResult,expResult);
}
}
