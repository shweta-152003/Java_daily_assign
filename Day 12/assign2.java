import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Multiplication is "+(a*b));
	if(a>b){
	System.out.println("Division is "+(a/b));
        }else{
	System.out.println("Division is "+(b/a));

     }
  }
}