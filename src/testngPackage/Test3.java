package testngPackage;

import org.testng.annotations.Test;

public class Test3 {
	
@Test
  public void WebloginCarLoan()
  {
	  System.out.println("This iss weblogin");
  }

@Test(groups={"Smoke"})
  public void Mobileloginincarloan()
  
  {
	System.out.println("This is mobilelogin");  
  }
  
@Test
public void MobileSIGNIN()

{
	System.out.println("This is MobileSIGNIN");  
}
@Test
public void MobileSIGNOut()

{
	System.out.println("This is mobileSIN OUT");  
}

@Test 
public void Loginapicarloan()
  
  {
	  System.out.println("This is Login api");
  }
  
  
  
  
}
