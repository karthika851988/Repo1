package sample;


import org.junit.Ignore;
import org.junit.Test;




@Ignore
public class Test1 {

	@Ignore
	@Test
	public void test1() {
		
		System.out.println("Test1");
		
	}
	
	@Test(timeout=10000)
	public void test2() {
		System.out.println("Test2");
	}

}
