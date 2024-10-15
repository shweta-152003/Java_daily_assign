import java.util.*;

class Codex{
	public static void main(String[] args){
	System.out.println("Enter the distance in feet: ");
	Scanner sc= new Scanner(System.in);
	float dis=sc.nextFloat();
	System.out.println("Equivalent distance for " +dis+ "ft in cm is "+(dis*30.48)+ " cm ");
    }
}