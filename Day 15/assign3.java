import java.util.*;
class Codex{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Distance: ");
	int dis=sc.nextInt();
	System.out.println("Time: ");

	int time=sc.nextInt();
	int velo=dis/time;
	System.out.println("The Velocity of a Particle roaming In space is "+velo+ " m/s.");
    }
}