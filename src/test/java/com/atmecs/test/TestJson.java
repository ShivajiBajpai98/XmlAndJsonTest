package com.atmecs.test;

import java.io.IOException;

import com.atmecs.utilities.JsonReader;
import org.testng.annotations.Test;

public class TestJson {
	@Test
	public  void testJsonReader() throws IOException {



		JsonReader json = new JsonReader(System.getProperty("user.dir")+"\\src\\test\\resources\\locators\\OR.json");
		System.out.println(json.getLocator("locators.homepage.username.css"));
	
	}

}
