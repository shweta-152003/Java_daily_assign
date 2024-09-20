import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter First number: ");
	int a=sc.nextInt();
	System.out.print("Enter Second number: ");
	int b=sc.nextInt();
       	System.out.print("Enter the sign of operation: ");
	char operation=sc.next().charAt(0);

	switch(operation){
		case '+':
			System.out.println("Addition of " + a + " & "+ b +" is "+(a+b));
			break;
		case '-':
			System.out.println("Subtraction of " + a + " & "+ b +" is "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication of " + a + " & "+ b +" is "+(a*b));
			break;
		case '/':
			System.out.println("Division of " + a + " & "+ b +" is "+(a/b));
			break;
		default:
			System.out.println("It is not a operation");

               }

	}
}