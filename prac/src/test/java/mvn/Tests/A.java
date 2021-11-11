package mvn.Tests;

import org.testng.annotations.Test;

public class A {
	 @Test
     public void read() {
    	 System.out.println("hello");
    	 String URL = System.getProperty("url");
    	 System.out.println(URL);
     }
}
