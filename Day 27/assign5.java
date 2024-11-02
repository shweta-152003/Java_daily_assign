import java.util.Scanner;
class Codex {
	public static void main(String[] args) {
		long num;
		int i = 0;
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextLong();
		while(num != 0) {
			num = num / 10;
			i++;
		}
		System.out.println("No of digits : " + i);
	}
}
