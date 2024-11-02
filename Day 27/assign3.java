import java.util.Scanner;
class Codex {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			if(n < 0)
				break;
			System.out.println("You entered : " + n);	
		}
	}
}
