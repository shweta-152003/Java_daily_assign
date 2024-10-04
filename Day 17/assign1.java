import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num=sc.nextInt();
	
	for(int i=10;i>=1;i--){
	int mul=num*i;
	System.out.println(+num+ " X " +i+ " = "+mul);
        }
     }
 }
