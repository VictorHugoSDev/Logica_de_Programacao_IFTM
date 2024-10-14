import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
	    int number = s.nextInt();
	    int hour = s.nextInt();
	    double salaryh = s.nextDouble();
	    
	    double salary = hour * salaryh;
	    
	    
	    System.out.println("NUMBER = " + number);
	    System.out.printf("SALARY = U$ %.2f\n", salary);
	}
}
