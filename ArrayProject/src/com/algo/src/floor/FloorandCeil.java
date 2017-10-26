package com.algo.src.floor;

import com.algo.src.basic.BaseArrayProblems;

public class FloorandCeil extends BaseArrayProblems{
	
	 
	
	public static void main(String[] args){	
		FloorandCeil ceil = new FloorandCeil();
		int Num = ceil.getNoofTestCases();
		int arraySize = ceil.getArraySize();
		int arrayValue[]  = new int[arraySize];
		System.out.println("Enter the mid value");
		int value =ceil.sc.nextInt();
		while(Num-->0){
			arrayValue = ceil.getArrayElements(arraySize);
			ceil.printArray(arrayValue);
			int floor = Integer.MIN_VALUE;
			int ceils = Integer.MAX_VALUE;
			for(int i=0;i<arrayValue.length;i++){
				if(arrayValue[i]<=value && arrayValue[i]>=floor){
					floor =arrayValue[i];
				}
				if(arrayValue[i]>=value && arrayValue[i]<=ceils){
					ceils=arrayValue[i];
				}	
			}	
			if(floor==Integer.MIN_VALUE){
			 System.out.println("NO FLOOR VALUE FOUND !!!!");	
			}
			if(ceils==Integer.MAX_VALUE){
				 System.out.println("NO CEIL VALUE FOUND !!!!");
			}		
			System.out.println("FLoor Value "+floor +" CEIL VAUE :"+ceils);	
		}
	}

	@Override
	public void coreProblemExecution() {
		// TODO Auto-generated method stub
		
	}

}
