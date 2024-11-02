import java.util.*;

class Codex {
	public static void main(String[] args){
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		for(int i = 1; i < num; i++){
			if(num % i==0){
				sum+=i;
			}
                }
		if(sum > num)
			System.out.println(num+" is an abundant number");
		else
			System.out.println(num+" is not an abundant number");
        }	
 }
	
