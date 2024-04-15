package com.example.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Selenium5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driverchrome=new ChromeDriver();
		driverchrome.get("https://www.demoblaze.com/");
		driverchrome.findElement(By.linkText("Laptops")).click();
		Thread.sleep(1000);
		
		driverchrome.findElement(By.linkText("MacBook Pro   ")).click();
		Thread.sleep(1000);
		
		driverchrome.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(1000);
		
		driverchrome.findElement(By.linkText("OK")).click();
		
		SpringApplication.run(Selenium5.class, args);
	}

}