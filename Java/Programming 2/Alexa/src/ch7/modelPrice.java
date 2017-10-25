package ch7;

public class modelPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num ={150,200,250,300,350};
		System.out.println("Model \t\tPrice");
		System.out.println("--------------------");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(("MD") + (i+1)+ ("\t\t") + (" $") + num[i]);
		    System.out.println((i+1)+ ("\t\t")+ num[i]);}
		int sum = 0;
		for (int a: num)
		    sum += a;
		
		System.out.println("Total of all values: " + sum);   
		

	}
	}
