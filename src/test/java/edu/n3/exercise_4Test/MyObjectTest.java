package edu.n3.exercise_4Test;

import edu.n3.exercise_4.MyObject;
import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MyObjectTest {

	List<Object> arrayList = new ArrayList<>();
	String string = "Test string";
	Integer integer = -586;
	MyObject myObject=new MyObject(5,6);

	@Test
	public void givenArrayListOfObjects_whenItContainsAllObjects_thenAssertionSucceeds() {
		arrayList.add(string);
		arrayList.add(integer);
		arrayList.add(myObject);
		
		assertThat(arrayList).contains(string).contains(integer).contains(myObject);
	}
	
	@Test
	public void givenArrayListOfObjects_whenItContainsAnObjectOnlyOnce_thenAssertionSucceeds() {
		arrayList.add(string);
		arrayList.add(integer);
		arrayList.add(myObject);
		
		assertThat(arrayList).containsOnlyOnce(string);
	}
	
	@Test
	public void givenArrayListOfObjects_whenItDoesNotContainAnObject_thenAssertionSucceeds() {
		arrayList.add(string);
		arrayList.add(myObject);	
		
		assertThat(arrayList).doesNotContain(integer);
	}

}
