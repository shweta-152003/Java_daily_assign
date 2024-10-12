import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter increasing number : ");
	int num=sc.nextInt();
	int num1=1;
	for(int i=1;i<=10;i++){
		System.out.print(num1+" ");
		num1=num1+num;
       }
   }
	
}