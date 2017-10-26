package com.algo.src.rearrage;

import java.util.Arrays;

import com.algo.src.basic.BaseArrayProblems;

public class RearrangeArray extends BaseArrayProblems{
	
	public static void main(String[] args){	
		RearrangeArray rearrangeArray = new RearrangeArray();
		int Num = rearrangeArray.getNoofTestCases();
		int arraySize = rearrangeArray.getArraySize();
		int arrayValue[]  = new int[arraySize];
		int arrayIndex=0;
		 while(Num-->0){
			arrayValue = rearrangeArray.getArrayElements(arraySize);
			rearrangeArray.printArray(arrayValue);
			Arrays.sort(arrayValue);
			rearrangeArray.printArray(arrayValue);
			int tempArray[] = new int[arraySize];
			for(int i=0, j=arraySize-1;i<=arraySize/2||j>arraySize/2;i++,j--){
				System.out.println("----------------------------");
				System.out.println("I Value : "+i+ "-- > J VALUE "+j );
				System.out.println("ArrayIndex :"+arrayIndex+ "-- > ArraySize "+arraySize );
				if(arrayIndex<arraySize){
					System.out.println("True "+"arrayIndex"+arrayIndex +"arraySize"+arraySize);
					tempArray[arrayIndex]=arrayValue[i];
					arrayIndex++;
				}
				if(arrayIndex<arraySize){
					tempArray[arrayIndex]=arrayValue[j];
					arrayIndex++;
				}
			
				rearrangeArray.printArray(tempArray);
				System.out.println("----------------------------");
			}
			
			
	 }
	}

	@Override
	public void coreProblemExecution() {
		// TODO Auto-generated method stub
		
	}

}
