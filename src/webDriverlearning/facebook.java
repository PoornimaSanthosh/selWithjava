package webDriverlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println("Title="+title);
if(title.equals("Facebook - log in or sign up\r\n"))
{
	System.out.println("title is matching..");
}
else
{

	System.out.println("title is not matching...");
}
	}
}


