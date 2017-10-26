package com.algo.src.occurence;

import com.algo.src.basic.BaseArrayProblems;

public class FirstandLastOccurance extends BaseArrayProblems{
	
	public static void main(String[] args){
		FirstandLastOccurance firstLast = new FirstandLastOccurance();
		int Num = firstLast.getNoofTestCases();
		int arraySize = firstLast.getArraySize();
		int array[] = firstLast.getArrayElements(arraySize);
		System.out.println("Enter the element to Check for Occurance");
		int occurance = firstLast.sc.nextInt();
		int first = Integer.MIN_VALUE, last = Integer.MAX_VALUE;
		for(int i=0;i<arraySize;i++){
			if(array[i]==occurance){
				if(first==Integer.MIN_VALUE){
					first =i;
				}
				last =i;
			}
		}
		System.out.println("Occurance Value "+occurance + "First Postion :"+first + "Last Position" +last);
	}

	@Override
	public void coreProblemExecution() {
		// TODO Auto-generated method stub
		
	}

}
