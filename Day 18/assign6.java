
import java.util.*;
class Codex{
	public static void main(String[] args){
	int arr[]=new int[6];

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter an array : ");
	for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();

        }
       System.out.print("Even elements : ");	
       for(int i=0;i<arr.length;i++){
	        if(arr[i]%2 == 0){
		System.out.print(arr[i]+" ");
               }
        }
	System.out.print("\nOdd Elements: ");
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2 == 1){
		System.out.print(arr[i]+" ");
               }
        }
    }
}