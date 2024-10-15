import java.util.*;
class Codex{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an array length: ");
	int l=sc.nextInt();
	System.out.println("Enter an array: ");
	int arr[]=new int[l];
	for(int i=0;i<l;i++){
		arr[i]=sc.nextInt();
	}
	
	int sum=0;
	for(int i=0;i<l;i++){
	sum=sum+arr[i];
        }
	System.out.println("Addition of array element is: "+sum);
    }
}