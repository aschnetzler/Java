package ch7;

public class extraCredit {

	public static void main(String[] args) {
		
		int[][] transactions;
		transactions=new int[5][4];
		transactions[0][0] = 50;
		transactions[0][1] = 20;
		transactions[0][2] = 30;
		transactions[0][3] = 80;
		
		transactions[1][0] = 60;
		transactions[1][1] = 80;
		transactions[1][2] = 90;
		transactions[1][3] = 70;
		
		transactions[2][0] = 80;
		transactions[2][1] = 90;
		transactions[2][2] = 100;
		transactions[2][3] = 60;
		
		transactions[3][0] = 20;
		transactions[3][1] = 30;
		transactions[3][2] = 40;
		transactions[3][3] = 50;
		
		transactions[4][0] = 70;
		transactions[4][1] = 90;
		transactions[4][2] = 90;
		transactions[4][3] = 80;
		
		System.out.println("\tI \tII \tIII \tIV");
		
		System.out.println("Div 1:"+"\t"+ 
							transactions[0][0]+"\t"+
							transactions[0][1]+"\t"+
							transactions[0][2]+"\t"+ 
							transactions[0][3]);
		
		System.out.println("Div 2:" +"\t"+
							transactions[1][0]+"\t"+
							transactions[1][1]+"\t"+
							transactions[1][2]+"\t"+
							transactions[1][3]);
		
		System.out.println("Div 3:" +"\t"+
							transactions[2][0]+"\t"+  
							transactions[2][1]+"\t"+ 
							transactions[2][2]+"\t"+
							transactions[2][3]);
		
		System.out.println("Div 4:" +"\t"+
							transactions[3][0]+"\t"+ 
							transactions[3][1]+"\t"+ 
							transactions[3][2]+"\t"+
							transactions[3][3]);
		
		System.out.println("Div 5:" +"\t"+
							transactions[4][0]+"\t"+ 
							transactions[4][1]+"\t"+ 
							transactions[4][2]+"\t"+
							transactions[4][3]);
		
		
				}
}
