import java.util.*;

class Codex {
	public static void main(String[] args){
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum;
		System.out.println("Series of Deficient Numbers is: ");
		for(int i=1;i<=num;i++){
		sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
			
				}
		}
		
		if(sum<i){
			System.out.print(i+" ");
		}
	}
	}
}