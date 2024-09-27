import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number: ");
	int num1=sc.nextInt();
	System.out.println("Enter the 2nd number: ");
	int num2=sc.nextInt();
	System.out.println("Before Swap :" +num1+ " "+num2);
	
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("After Swap :" +num1+ " "+num2);
     }
}