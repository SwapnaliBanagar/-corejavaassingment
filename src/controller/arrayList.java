package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrayList {

	public static void main(String[] args) {
		List<Integer> alNumberList=new ArrayList<>();
		alNumberList.add(1);
		alNumberList.add(2);
		alNumberList.add(3);
		alNumberList.add(1);
		alNumberList.add(1);
		alNumberList.add(4);
		System.out.println(alNumberList);
		List<Integer> alNumber=new ArrayList<>();
		for(int i=0; i<alNumberList.size(); i++)
		{
			if(alNumberList.get(i)==1)
			{
				alNumber.add(alNumberList.get(i));
			}
		}
		System.out.println(alNumber);

		List<Integer> alNumberList2=Arrays.asList(1,2,3,3,4,5,4,4,5,4);
		List<String> listOfStringValue=alNumberList2.stream().map(e->String.valueOf(e)).collect(Collectors.toList());
		List<String> listOf1String=listOfStringValue.stream().filter(e->e.startsWith("4")).collect(Collectors.toList());
		System.out.println(listOf1String);


		int add =alNumberList2.stream().reduce((num1,num2)->num1+num2).get();
		System.out.println("Sum Of Given number from Array List = "+add);



		List<Integer> even =alNumberList2.stream().filter(e->e%2==0).collect(Collectors.toList());
		int sumOfEven=even.stream().reduce((num1,num2)->num1+num2).get();
		System.out.println("Sum Of Even Number = "+sumOfEven);



		List<Integer> odd =alNumberList2.stream().filter(e->e%2!=0).collect(Collectors.toList());
		int sumOfOdd=odd.stream().reduce((num1,num2)->num1+num2).get();
		System.out.println("Sum Of Odd Number = "+sumOfOdd);


	}
}
