
class Codex {
	public static void main(String[] args) {
		int n=5;		
		int a = 0, b = 1, c;
		System.out.print(a + " "  + b + " ");
		for(int i = 0; i < n - 2; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
