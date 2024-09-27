import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Min of Series: ");
	int num1=sc.nextInt();

	System.out.print("Max of Series: ");
	int num2=sc.nextInt();

	System.out.println("Series of Even Number Ranging between "+num1+ " & "+num2+ " is : " );
	for(int i=num1;i<=num2;i++){
	if(i % 2 == 0){
	System.out.print( i+ ", ");
     }
   }
 } 
}