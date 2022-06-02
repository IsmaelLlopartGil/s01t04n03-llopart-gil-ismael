package edu.n3.exercise_7Test;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MyObjectTest {

	String string="";
	String string2=null;

	@Test
	public void givenStringObject_whenIsEmpty_thenAssertionSucceeds() {
		assertThat(string).isEmpty();
	}
	
	@Test
	public void givenStringObject_whenIsNull_thenAssertionSucceeds() {
		assertThat(string2).isNull();
	}
	
	@Test
	public void givenStringObject_whenIsBlank_thenAssertionSucceeds() {
		assertThat(string).isBlank();
		assertThat(string2).isBlank();
	}
}
