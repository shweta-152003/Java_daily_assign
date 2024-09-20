import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Addition is "+(a+b));
	if(a>b){
	   System.out.println("Subtraction is "+(a-b));
       }else{
	    System.out.println("Subtraction is "+(b-a));

      }
    }
}