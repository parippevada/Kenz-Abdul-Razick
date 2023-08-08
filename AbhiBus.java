package kenzie;


import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AbhiBus {
public static void main(String Args[]) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//*[@id=\"pills-home-tab\"]")).click();
	driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	
	driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	driver.findElement(By.xpath("//a[text()='7']")).click();
	
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	WebElement busName = driver.findElements(By.xpath("//*[@id=\"result_1655595902\"]/div[2]/div[1]/h2"));
	
	String name1 = busName.getText();
	System.out.println(name1);
	
	driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
	WebElement seats = driver.findElement(By.xpath("//p[text()='26 Seats Available']")).click();
	
	String name2 = seats.getText();
	System.out.println("Number of seats - "+ name2);
	
	driver.findElement(By.className("book")).click();
	driver.findElement(By.xpath("//a[@id='UO3-5ZZ']")).click();
	
	System.out.println(driver.findElement(By.xpath("//span[@id='seatnos']")).getText());
	
	WebElement boardDD = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
	Select BoardPoint = new Select(boardDD);
	BoardPoint.selectByIndex(4);
	
	WebElement arrivalDD = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
	Select ArrivalPoint = new Select(arrivalDD);
	ArrivalPoint.selectByIndex(3);
	
	driver.getTitle();
	
	driver.close();
	
	
	
}
}
