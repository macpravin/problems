package com.algo.src.sort;

import java.util.Arrays;

import com.algo.src.basic.BaseArrayProblems;

public class HalfAscendDecend extends BaseArrayProblems{
	
	public static void main(String args[]){
		HalfAscendDecend halfAscendecend = new HalfAscendDecend();
		int Num = halfAscendecend.getNoofTestCases();
		int arraySize = halfAscendecend.getArraySize();
		while(Num-->0){
			int array[] = halfAscendecend.getArrayElements(arraySize);
			halfAscendecend.printArray(array);
			Arrays.sort(array);
			System.out.println();
			for(int i=0;i<arraySize/2;i++){
				System.out.print(array[i]);
			}
			for(int j=arraySize-1;j>=arraySize/2;j--){
				System.out.print(array[j]);
			}
			
		}
		
	}

	@Override
	public void coreProblemExecution() {
		// TODO Auto-generated method stub
		
	}

}
