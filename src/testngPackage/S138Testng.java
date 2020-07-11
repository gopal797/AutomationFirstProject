package testngPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class S138Testng {

	
		
		@Test
		public void Demo()
		{
			System.out.println("heeelo");
		}
        @Test(groups={"Smoke"})
        
        public void Demo1()
        {
        	System.out.println("This is Gopal");
        }
        
        
      
        @BeforeTest  
        public void Demo2()
        {
        	System.out.println("I will excute test at first Top");
        }

}
