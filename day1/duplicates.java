package week1.day1;

import java.util.Arrays;

public class duplicates{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] data= {2,5,7,7,5,9,2,3};
	Arrays.sort(data);
		for(int i=0; i< data.length-1; i++)
			
			for(int j=i+1; j< data.length; j++)	
			
			
			if (data[i]==data[j])
				
		System.out.println("duplicate value: " +data[j]);


	}

}
