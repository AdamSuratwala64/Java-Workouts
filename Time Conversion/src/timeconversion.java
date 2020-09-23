import java.util.Scanner;
public class timeconversion {

	static int days = 0;
	static int daysleft = 0;
	static int years = 0;
	public static void main(String[] args) {
		// Time conversion program
		int a = 0;
		System.out.println("This program takes input from the user in minutes and then converts it to the number of years and days passed.");
		System.out.println("Please enter the number of minutes : ");
		Scanner s = new Scanner(System.in);	
		a = s.nextInt();
		System.out.println("You have entered "+ a + " minutes.");
		Tconversion(a);
		
	}
	
	public static void Tconversion(int min) {
		years = min/525600;
		days = min/1440;
		daysleft = days - (years*365);
		System.out.println("The minutes entered have been converted to Years and Days.");
		System.out.println("Years :" + years);
		System.out.println("Days : " + daysleft);
	}
}

