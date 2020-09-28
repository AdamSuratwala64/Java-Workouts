import java.util.Scanner;

public class matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;
		int n=0;
		System.out.println("This program prints the sum of each element of an array and prints a new array after the sum.");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows for the arrays : ");
		m = s.nextInt();
		System.out.println("Enter the number of columns for the arrays : ");
		n = s.nextInt();
		
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int c[][] = new int[m][n];

		
		System.out.println("Enter the elements for the first array.");
		for(int i = 0; i<m ; i++)
		{
			for(int j = 0; j<n ; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("\n\nEnter the elements for the second array.");
		for(int i = 0; i<m ; i++)
		{
			for(int j =0; j<n ; j++)
			{
				b[i][j] = s.nextInt();
			}
		}
		System.out.println("\n\nSumming the elements of first and second array. Creating a third array.");
		for(int i = 0; i<m ; i++)
		{
			for(int j =0; j<n ; j++)
			{
				c[i][j] = (a[i][j] + b[i][j]);
			}
		}
		System.out.println("Now displaying the third array.");
		for(int i = 0; i<m ; i++)
		{
			for(int j =0; j<n ; j++)
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
