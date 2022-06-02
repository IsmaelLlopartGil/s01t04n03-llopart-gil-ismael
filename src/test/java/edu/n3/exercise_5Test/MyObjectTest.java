package edu.n3.exercise_5Test;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MyObjectTest {

	Map<Integer, String> map=new HashMap<>();

	@Test
	public void givenMap_whenItContainsKey_thenAssertionSucceeds() {
		map.put(5, "element1");
		map.put(4, "element1");
		map.put(-5, "element1");
		
		assertThat(map).containsKey(4);
	}


}
