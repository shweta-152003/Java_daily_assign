import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	
	for(int i = 1; i <= num; i++) {
	  int sum =  0;
           for(int j = 1; j <= i / 2; j++) {
	        if(i % j == 0)
		   sum += j;
		}
		if(sum == i)
		   System.out.println(i + " ");
		}
	}
}

