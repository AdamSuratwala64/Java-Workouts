import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of employees : ");
		int a = s.nextInt();
		String name[] = new String[a];
		int year[] = new int[a];
		String addr[] = new String[a];
		
		for(int i = 0; i<a; i++ )
		{
			System.out.println("Enter the name of employee : ");
			name[i] = s.next();
			System.out.println("Enter the year of joining : ");
			year[i] = s.nextInt();
			System.out.println("Enter the address of employee : ");
			addr[i] = s.next();
		}
		
		for(int i = 0; i<a; i++ )
		{
			System.out.println(name[i] + "   " + year[i] + "   " + addr[i]);
		}
		
		s.close();
	}

}
