package com.example.selenium2;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4classwork2Application {

	public static void main(String[] args) {



		WebDriver driverchrome=new ChromeDriver();
        driverchrome.get("https://www.shoppersstop.com/");
		driverchrome.getTitle();
		driverchrome.findElement(By.className("user-icon")).click();
		//driver.findElement(By.id(null)

		SpringApplication.run(Day4classwork2Application.class, args);
	}

}