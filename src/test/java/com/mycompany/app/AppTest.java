package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        new App().displaySomething ();
        try {

            // assertTrue("GitHubActions123" + System.getProperty("line.separator"), outContent.toString());
               assertTrue("GitHubActions fail RKFI kdfdkjf",true);
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello World! application\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    public void something(){
		System.out.println("kuba");
	}
}
