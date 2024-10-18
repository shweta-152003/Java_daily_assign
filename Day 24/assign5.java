import java.util.Scanner;

class Codex {
	public static void main(String[] args) {
		System.out.println("Enter the 5 numbers: ");
		int [] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			if(i > 0) {
			
				if(arr[i - 1] > arr[i]){
				System.out.println("Unexpected input");
				break;
			}
			
		     }
		}
	}
}
