package myPackage;



import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		
		//Module riêng lẻ + - * /
		
		//Cộng
		Assert.assertEquals(22, cal.Tinh("11+11"),0.1);

		Assert.assertEquals(1, cal.Tinh("1"),0.1);
				
		//Trừ
		
		Assert.assertEquals(2, cal.Tinh("5-3"),0.1);
		
		Assert.assertEquals(-2, cal.Tinh("3-5"),0.1);
		
		Assert.assertEquals(5, cal.Tinh("5-0"),0.1);	
		
		//Nhân
		
		Assert.assertEquals(6, cal.Tinh("2*3"),0.1);
		
		Assert.assertEquals(0, cal.Tinh("2*0"),0.1);	
		
		//Chia
		
		Assert.assertEquals(2, cal.Tinh("6/3"),0.1);
		
		Assert.assertEquals(0.5, cal.Tinh("1/2"),0.1);
		
		Assert.assertEquals(0, cal.Tinh("0/3"),0.1);
	
		
		//Module 2 toán tử
		
		//+-
		Assert.assertEquals(5, cal.Tinh("3+4-2"),0.1);
		
		Assert.assertEquals(5, cal.Tinh("3-2+4"),0.1);
		
		
		
		//+*
		Assert.assertEquals(11, cal.Tinh("3+4*2"),0.1);
				
		Assert.assertEquals(10, cal.Tinh("3*2+4"),0.1);
					
		//+/
		Assert.assertEquals(8, cal.Tinh("6+4/2"),0.1);
		
		Assert.assertEquals(6, cal.Tinh("6/3+4"),0.1);
				
		
		//-*
		Assert.assertEquals(-2, cal.Tinh("6-4*2"),0.1);
		
		Assert.assertEquals(16, cal.Tinh("6*3-2"),0.1);
		
		//-/
		
		Assert.assertEquals(4, cal.Tinh("6-4/2"),0.1);
		
		Assert.assertEquals(0, cal.Tinh("6/3-2"),0.1);
		
		//Module 3 toán tử
		
		//+ - *
		
		Assert.assertEquals(2, cal.Tinh("6+2-3*2"),0.1);
		
		Assert.assertEquals(12, cal.Tinh("6+2*4-2"),0.1);
		
		Assert.assertEquals(12, cal.Tinh("6-2+4*2"),0.1);
		
		Assert.assertEquals(0, cal.Tinh("6-2*4+2"),0.1);
		
		Assert.assertEquals(14, cal.Tinh("6*2+4-2"),0.1);
		
		Assert.assertEquals(10, cal.Tinh("6*2-4+2"),0.1);
			
		
		//+-/
		
		Assert.assertEquals(5, cal.Tinh("6+2-6/2"),0.1);
		
		Assert.assertEquals(6, cal.Tinh("6+6/3-2"),0.1);
		
		Assert.assertEquals(6, cal.Tinh("6-2+4/2"),0.1);
		
		Assert.assertEquals(6, cal.Tinh("6-4/2+2"),0.1);
		
		Assert.assertEquals(5, cal.Tinh("6/2+4-2"),0.1);
		
		Assert.assertEquals(1, cal.Tinh("6/2-4+2"),0.1);
		
		
		//Module 4 toán tử
		
		//+-*/
		
		Assert.assertEquals(5, cal.Tinh("6+2-2*3/2"),0.1);
		
		Assert.assertEquals(4, cal.Tinh("6+2-6/3*2"),0.1);
		
		Assert.assertEquals(7, cal.Tinh("6-2+2*3/2"),0.1);
		
		Assert.assertEquals(8, cal.Tinh("6-2+6/3*2"),0.1);
		
		Assert.assertEquals(11, cal.Tinh("6*2+2-6/2"),0.1);
		
		Assert.assertEquals(12, cal.Tinh("6*2+6/3-2"),0.1);
		
		
	}

}
