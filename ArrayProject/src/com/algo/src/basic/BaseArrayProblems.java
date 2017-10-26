package com.algo.src.basic;

import java.util.Scanner;

public abstract class BaseArrayProblems {

	public Scanner sc = new Scanner(System.in);

	public int mNoOfTestCases;

	public int[] arrayElements;

	public void printArray(int[] array) {
		System.out.println("The Arrray Element is :");
		System.out.print("{");
		for (int value : array) {
			System.out.print(value + ",");
		}
		System.out.print("}");
	}

	public int getNoofTestCases() {
		System.out.println("Enter the No.of Test Cases to perform");
		return sc.nextInt();
	}

	public int getArraySize() {
		System.out.println("Enter the size of the Array");
		return sc.nextInt();
	}

	public int[] getArrayElements(int arraySize) {
		System.out.println("Enter Array Elements");
		arrayElements = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			arrayElements[i] = sc.nextInt();
		}
		return arrayElements;
	}

	public void performBasicOperation() {
		mNoOfTestCases = getNoofTestCases();
		int size = getArraySize();
		while (mNoOfTestCases-- > 0) {
			getArrayElements(size);
			printArray(arrayElements);
			coreProblemExecution();
		}
	}

	public abstract void coreProblemExecution();

}
