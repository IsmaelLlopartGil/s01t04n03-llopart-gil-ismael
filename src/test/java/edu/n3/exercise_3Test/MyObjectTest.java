package edu.n3.exercise_3Test;

import edu.n3.exercise_3.MyObject;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyObjectTest {

	MyObject myObject;

	@Test
	public void givenTwoIntArrays_whenTheyAreEqual_thenAssertionSucceeds() {
		int[] array1 = {5, 0, -987};
		int[] array2 = {5, 0, -987};
		myObject = new MyObject(array1, array2);

		assertThat(myObject.getIntArray1()).isEqualTo(myObject.getIntArray2());
	}

	@Test
	public void givenTwoIntArrays_whenTheyAreNotEqual_thenAssertionSucceeds() {
		int[] array1 = {5, 0, 1, -987};
		int[] array2 = {5, 0, 2, -987};
		myObject = new MyObject(array1, array2);

		assertThat(myObject.getIntArray1()).isNotEqualTo(myObject.getIntArray2());
	}
}
