package com.algo.src.rearrage;

import java.util.LinkedList;

import com.algo.src.basic.BaseArrayProblems;

public class RearrangePostThenNeg extends BaseArrayProblems{
	
	public static void main(String[] args){
		RearrangePostThenNeg repost  = new RearrangePostThenNeg();
		int Num = repost.getNoofTestCases();
		int arraySize = repost.getArraySize();
		int arrayValue[] = new int[arraySize];
		while(Num-->0){
			arrayValue = repost.getArrayElements(arraySize);
			LinkedList<Integer> negativeList  =new LinkedList<>();
			LinkedList<Integer> positiveList  =new LinkedList<>();
			for(int i=0;i<arraySize;i++){
				if(arrayValue[i]>0){
					positiveList.addLast(arrayValue[i]);
				}else{
					negativeList.addLast(arrayValue[i]);
				}
			
			}
			positiveList.addAll(negativeList);
			System.out.println(positiveList);
			
		}
		
	}

	@Override
	public void coreProblemExecution() {
		// TODO Auto-generated method stub
		
	}

}
