//*******************************************************
//DO NOT MODIFY THIS FILE!!!
//*******************************************************

package projectZeroTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import projectZero.ProjectZero;

public class ProjectZeroTest
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    
	/**
	 * Set the Standard output and error streams to
	 * send to our private streams instead of the
	 * console before each test runs
	 */
	@Before
	public void setup()
	{
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	/**
	 * Reset the Standard output, error, and input
	 * streams back to their default (Console and
	 * System.in) after each test runs
	 */
	@After
	public void cleanUpStreams()
	{
		System.setOut(System.out);
		System.setErr(System.err);
		System.setIn(System.in);
	}
	
	@Test
	public void testOutput()
	{	
		String expected = "Hello World\n";
		
		try {
			ProjectZero.main(null);
		} catch (Exception e) {
			fail("Caught an Exception");
		}
		
		assertEquals("Output didn't match the expected", expected, outContent.toString().replace("\r", ""));
	}
}
