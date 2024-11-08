import java.util.*;

class Codex {
	public static void main(String[] args){
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long rem ,sum=0;
		while(num>0){
			rem=num % 10;
			sum+=rem;
			num=num/10;
             }
		System.out.println(sum);
	}
}