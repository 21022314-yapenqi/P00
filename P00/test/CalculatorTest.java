import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a,b,c;
	Calculator ca1;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// used for initialisation at the top and the other methods
		ca1 = new Calculator();
		 a = 4321;
		 b = 1234;
		 c = 0;
	}
	


	@After
	public void tearDown() throws Exception {
	}
	
		

	@Test
	public void testadd() {
		//Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		
		//Add
		int actual = cal.add(a, b);
		
		//Assert
		int expected = 9999;
	   assertEquals(actual,expected);
	}
		
	public void testsubtract() {
		
		   
			//add
			int actual = ca1.subtract(a, b); 
		   //assert
			int expected = 3087;
			assertEquals (expected, actual);
			}
	
	public void testmultiple() {
		//Arrange
		int a = 1234;
		int b = 8765;
			//add
			int actual = ca1.multiple(a, b); 
		   //assert
			int expected = 5332114;
			assertEquals (expected, actual);
			}
	public void testdivide() {
		//Arrange
		int a = 1234;
		int b = 8765;
		//add
		int actual = ca1.divide(a, b); 
	   //assert
		int expected = 3;
		assertEquals (expected, actual);
		
	}
	
	
	
	
	

	}


