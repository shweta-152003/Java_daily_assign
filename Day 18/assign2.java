import java.util.*;
class Codex {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Mass: ");
	double m=sc.nextDouble();
	System.out.println("Enter Velocity: ");
	double v=sc.nextDouble();
	if(m>=0 && v>=0){
		System.out.println("Kinetic Energy : "+(m*v*v/2));
       }else{
	        System.out.println("Enter valid details");
       }
    }
}