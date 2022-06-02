package edu.n3.exercise_1Test;


import edu.n3.exercise_1.MyObject;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MyObjectTest {

	MyObject myObject;

	@ParameterizedTest
	@CsvSource({ "0,0","564,564", "-2598,-2598" })
	public void givenObjectWithTwoIntegers_whenTheyAreEqual_thenAssertionSucceeds(Integer integer1, Integer integer2) {
		myObject = new MyObject(integer1, integer2);

		assertThat(myObject.getInteger1()).isEqualTo(myObject.getInteger2());
	}

	@ParameterizedTest
	@CsvSource({ "0,-1","5640,564", "-2598,-598", "-598,598" })
	void givenObjectWithTwoIntegers_whenTheyAreNotEqual_thenAssertionSucceeds(Integer integer1, Integer integer2) {
		myObject = new MyObject(integer1, integer2);

		assertThat(myObject.getInteger1()).isNotEqualTo(myObject.getInteger2());
	}

}
