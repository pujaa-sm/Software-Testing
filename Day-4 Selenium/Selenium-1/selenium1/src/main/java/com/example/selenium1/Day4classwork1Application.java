package com.example.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4classwork1Application {

	public static void main(String[] args) {

		WebDriver driverchrome=new ChromeDriver();
		WebDriver driveredge=new EdgeDriver();
		WebDriver driverfirefox=new FirefoxDriver();
		driverchrome.get("https://www.google.com");
		driverchrome.manage().window().fullscreen();
        driverchrome.close();
		driveredge.get("https://www.google.com");
        driveredge.close();
		driverfirefox.get("https://www.google.com");
        driverfirefox.close();

		SpringApplication.run(Day4classwork1Application.class, args);
	}

}
