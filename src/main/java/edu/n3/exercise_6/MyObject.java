package edu.n3.exercise_6;

public class MyObject {

	private int[] intList;

	public MyObject(int[] intList) {
		this.intList = intList;
	}

	public void printIntList(int untilThis) throws IndexOutOfBoundsException {

		for (int i = 0; i < untilThis; i++) {
			System.out.println(intList[i]);
		}
	}
}
