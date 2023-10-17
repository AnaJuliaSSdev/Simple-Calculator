package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class DemoApplicationTests {


	@Test
	public void test() throws IOException {
		String input = "2\r\n3\r\n";
		String expected = "6.0\r\n-1.0\r\n"; 
		String actual;

		InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		PrintStream outputStream = new PrintStream(byteArrayOutputStream);

		PrintStream previousOut = System.out;
		InputStream previousIn = System.in;

		System.setIn(inputStream);
		System.setOut(outputStream);

		DemoApplication.main(null);

		actual = byteArrayOutputStream.toString();

		assertEquals(expected, actual);

		inputStream.close();
		outputStream.close();

		System.setOut(previousOut);
		System.setIn(previousIn);

	}
}