import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
        int c=a*a*a;
        int d=b*b*b;
	System.out.println("Addition of "+ c + " & " + d +" is "+(c+d));
	int e=a*a;
	int f=b*b;
	System.out.println("Subtraction of "+ e +" & " + f +" is "+(e-f));

    }
}