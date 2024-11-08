import java.util.*;

class Codex {
	public static void main(String [] args){
		System.out.println("Enter the number: " );
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		int i=0,j=0;
		
		
		while(num > 0){
			if( (num % 10) % 2 == 0)
				i++;
			else
				j++;
			num = num/10;
		}
	System.out.println("The number Contains " +j+ " Odd Digits & Even " +i);	
	}
}