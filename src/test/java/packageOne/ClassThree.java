package packageOne;

import org.testng.annotations.Test;

public class ClassThree {
	
	@Test
	public void testThree(){
		
		int a = 5/0;
		System.out.println("Value of a :"+a);
		
	}
	
}
