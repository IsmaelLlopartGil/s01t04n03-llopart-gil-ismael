package edu.n3.exercise_6Test;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import edu.n3.exercise_6.MyObject;

class MyObjectTest {

	MyObject myObject;

	@Test
	public void givenPrintIntListMethod_whenItThrowsAnIndexOutOfBoundsException_thenAssertionSucceeds() {
		int[] intList= {0,1,2,3};
		myObject=new MyObject(intList);
		
		assertThatExceptionOfType(IndexOutOfBoundsException.class)
		  .isThrownBy(() -> {
		      myObject.printIntList(5);
		});
	}
}
