package edu.n3.exercise_2Test;


import edu.n3.exercise_2.MyObject;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyObjectTest {

	MyObject myObject1, myObject2;

	@Test
	public void givenTwoReferencesToAnObject_whenTheyAreEqual_thenAssertionSucceeds() {
		myObject1 = new MyObject(0,0);
		myObject2 = myObject1;

		assertThat(myObject1).isEqualTo(myObject2);
	}

	@Test
	public void givenTwoReferencesToAnObject_whenTheyAreNotEqual_thenAssertionSucceeds() {
		myObject1 = new MyObject(0,0);
		myObject2 = new MyObject(0,0);

		assertThat(myObject1).isNotEqualTo(myObject2);
	}

}
