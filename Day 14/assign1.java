import java.util.*;
class Codex{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);

	System.out.print("Min of series: ");
	int num1=sc.nextInt();

	System.out.print("Max of series: ");
	int num2=sc.nextInt();
	System.out.println("Series of odd number Ranging between "+num1+ " & " +num2+ " is: " );

        for(int i=num1;i<=num2;i++){
	   if(i%2==1){
		System.out.print( i+" " );
	
         }
      }
  }
}