import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number: ");
	int num1=sc.nextInt();
	System.out.println("Enter the 2nd number: ");
	int num2=sc.nextInt();
	int fac=1;
	for(int i=num1;i<=num2;i++){
	fac=fac*i;
	System.out.println("Factorial of "+i+" = "+fac);
      }
   }
}