import java.util.Scanner;

public class decisionstatements {

	public static void main(String[] args) {
		// For this program, I will be trying out IF-ELSE and Switch statements
		System.out.println("Welcome to FLYHIGH Tours.");
		int select;
		System.out.println("Enter a choice:\n1. Delhi, India \n2. Bern, Switzerland \n3. London, UK \n4. Auckland, New Zealand");
		Scanner s = new Scanner(System.in);
		select = s.nextInt();
		if(select == 1)
		{
			System.out.println("You've chosen Delhi, India. Brilliant choice!");
		}
		else if(select == 2)
		{
			System.out.println("You've chosen Bern, Switzerland. Fabulous choice!");
		}
		else if(select == 3)
		{
			System.out.println("You've chosen London, UK. Classic choice!");
		}
		else if(select == 4)
		{
			System.out.println("You've chosen Auckland, New Zeland. Beautiful choice!");
		}
		else {
			System.out.println("Invalid Choice");
		}
		
		
		
		System.out.println("\n\n\n\nWelcome to Exotica Holidays.");
		int choice;
		System.out.println("Enter a choice:\n1. London, UK \n2. Auckland, New Zealand \n3. Delhi, India \n4. Bern, Switzerland");
		Scanner s2 = new Scanner(System.in);
		choice = s2.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("You've chosen London, UK. Classic Choice!");
		break;
		case 2 : System.out.println("You've chosen Auckland,New Zealand. Beautiful Choice!");
		break;
		case 3 : System.out.println("You've chosen Delhi, India. Brilliant Choice!");
		break;
		case 4 : System.out.println("You've chosen Bern, Switzerland. Fabulous Choice!");
		break;
		default : System.out.println("Invalid Choice");
		}
	}

}
