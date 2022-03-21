package com.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {
    @Test public void testAppHasAGreeting() {
        Project classUnderTest = new Project();
        assertNotNull("app should have a greeting",
                       classUnderTest.getGreeting());
    }

   @Test
   public void test(){
     Project.test();
   }
}
public class ForLoopInfiniteExample {

	public static void main(String[] args) {

		// for loop condition to true.
		// this loop runs forever.
		for (; true;) {
			// core logic
			System.out.println("Running loop");
		}
	}
}
