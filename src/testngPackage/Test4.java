package testngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
	
@Parameters({"URL"})
@Test
  public void WebloginHomeLoan(String urlname)
  {
	  System.out.println("This is URL webloginHome");
	  System.out.println(urlname);  //147. Parameterising from TestNG xml file //In real time for selenium driver.get("")
	  //for resr assured given, when, then we r using
	  
  }

@Test(timeOut=4000)  //This will wait for 4 sec before throwing an error, when this will use whwn script will take more time to excute 

  public void MobilelogininHomeloan()
  
  {
	System.out.println("This is mobileloginHome");  
  }
  
@BeforeMethod
public void BeforeMethodOnly()

{
	System.out.println("This is Method excute before");  
}
 


//This is one of the depends method that will excute first then below excute later 
 @Test(dependsOnMethods={"WebloginHomeLoan","MobilelogininHomeloan"})
public void ApinapiHomeloan()
  
  {
	  System.out.println("This is Login apiHome");
  }
  
 @AfterTest
 public void Loginaftertest()
   
   {
 	  System.out.println("I will excute at the last");
   }
 
 @BeforeSuite(groups={"Smoke"})
 public void Beforesuitonly()
 
 {
	  System.out.println("I will excute suit at TOP most no 1 position");
 }
 
 @AfterMethod
 public void AfterMethodOnly()

 {
 	System.out.println("This is Method excute After");  
 }
   
 
 
 }
