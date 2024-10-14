import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int c = x * 100;
		int m = x * 1000;
		float q = x / 1000.00f;
		float ma = x / 1609.00f;
		
		System.out.println(x + " metros");
		System.out.println(c + " centímetros");
		System.out.println(m + " milímetros");
		System.out.printf("%.4f quilômetros\n", q);
		System.out.printf("%.4f milhas\n", ma);
		
	}
}
