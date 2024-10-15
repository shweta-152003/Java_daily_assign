import java.util.*;

class Codex{
	public static void main(String[] args){
	System.out.println("Enter the number: ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int arr[]={1,2,3,4,5};
	boolean found=false;
	for(int i=0;i<arr.length;i++){
	    if(arr[i]==num){
	       found = true;
                break;             }
        }

        
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
   }
}