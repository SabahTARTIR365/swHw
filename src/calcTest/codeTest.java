package calcTest;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calcCode.myCalc;

public class codeTest {


	@Test
	void test() {
		myCalc test =new myCalc();
		int  result =test.add(3, 3);
		
		assertEquals(6, result);
	}

	@Test
	void test2() {
		myCalc test =new myCalc();
		int  result =test.mul(3, 3);
		
		assertEquals(9, result);
	}
}
