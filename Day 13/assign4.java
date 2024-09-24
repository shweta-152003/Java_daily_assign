import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int fac=1;
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	for(int i=num;i>=1;i--){
	fac=fac*i;
	
        }
	System.out.println("The Factorial of  " + num + " is  : "+fac);
		
    }
}