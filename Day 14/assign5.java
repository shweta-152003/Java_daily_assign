import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers: ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	if(num1>num2){
		System.out.println("The maximun number amongst "+num1+" & " +num2+ " is "+num1);
       }else{
		System.out.println("The maximun number amongst "+num1+" & " +num2+ " is "+num2);

      }
  }

}