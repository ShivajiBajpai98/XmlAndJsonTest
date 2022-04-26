package com.atmecs.test;

import com.atmecs.utilities.XMLReader;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestXML {

	@Test
	public  void testXmlReader() throws IOException {



		XMLReader xml = new XMLReader(System.getProperty("user.dir")+"\\src\\test\\resources\\locators\\OR.xml");
		System.out.println(xml.getLocator("username.xpath"));

		
		//driver.findElement(By.xpath(xml.getLocator("homepage.header.username.css"))).sendKeys();
	}

}
