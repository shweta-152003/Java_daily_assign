import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
 	int cube;
	int square;
	for(int i=1;i<=num;i++){
	if(i%2==0){
	cube=i*i*i;
	square=i*i;
	System.out.println("Cube of " +i+ " : "+ cube +" and  Square of " +i+ " : "+ square);
     }
  }
 }
}