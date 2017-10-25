package practice;
public class ch7PracticeLab {

	public static void main(String[] args) {
		int[] num ={100,200,300,400,500};
		System.out.println("Total Item \t\t Value");
		System.out.println("---------------------");
		
		
		for(int i=0;i<5;i++)
		{
		    System.out.println((i+1)+ ("\t\t")+ num[i]);}
		int sum = 0;
		for (int a: num)
		    sum += a;
		
		System.out.println("Total of all values: " + sum);   
		

	}
	}



					